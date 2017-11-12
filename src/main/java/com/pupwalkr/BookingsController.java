package com.pupwalkr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pupwalkr.dto.Booking;
import com.pupwalkr.dto.BookingResponse;
import com.pupwalkr.model.Packages;
import com.pupwalkr.model.User;
import com.pupwalkr.repository.UsersRepository;
import com.pupwalkr.worldpay.Transaction;
import com.pupwalkr.worldpay.UDF;
import com.pupwalkr.worldpay.VaultCustomer;
import com.pupwalkr.worldpay.WorldPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/{customerId}/bookings")
public class BookingsController {
   private UsersRepository users;

   private WorldPay worldPay;

   @Autowired
   public BookingsController(UsersRepository users, WorldPay worldPay) {
      this.users = users;
      this.worldPay = worldPay;
   }

   @GetMapping
   public void getBookings() {
      hashCode();
   }

   @PostMapping
   public ResponseEntity<BookingResponse> saveBookings(@PathVariable int customerId, @RequestBody Booking booking) {
      double toCharge = 0.0;

      User user = this.users.getOne(customerId);
      if (user == null) {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }

      String worldPayId = user.getWorldPayId();
      VaultCustomer customer;
      if (worldPayId == null) {
         customer = this.worldPay.createCustomer(user);
         user.setWorldPayId(customer.getCustomerId());
         user = this.users.save(user);
      } else {
         customer = this.worldPay.getCustomer(worldPayId);
      }

      if (customer == null) {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }

      int left = customer.getUserDefinedFields().stream()
              .filter(t -> t.getUdfName().equalsIgnoreCase("udf1"))
              .mapToInt(t -> Integer.parseInt(t.getUdfvalue()))
              .findFirst()
              .orElse(0);

      if (left > 0) {
         List<UDF> fields = new ArrayList<>();
         fields.add(new UDF("udf1", Integer.toString(left)));
         customer.setUserDefinedFields(fields);
         this.worldPay.updateCustomer(worldPayId, customer);
      } else {
         // charge them
         left = 20;
         toCharge = 260.0;
         List<UDF> fields = new ArrayList<>();
         fields.add(new UDF("udf1", Integer.toString(left)));
         customer.setUserDefinedFields(fields);
         this.worldPay.updateCustomer(worldPayId, customer);
      }

      toCharge += booking.getLineItems().stream()
              .mapToDouble(t -> t.getQuantity() * t.getCost())
              .sum();

      Transaction t = this.worldPay.chargeCustomer(worldPayId, "1", toCharge);

      BookingResponse response = new BookingResponse();
      response.setTransactionId(Integer.toString(t.getTransactionId()));
      response.setCreditsRemaining(Integer.toString(left));
      return new ResponseEntity<>(response, HttpStatus.OK);
   }

   private Pair<Boolean, Pair<Boolean, List<Packages>>> findAvailableAndSubtract(List<Packages> availablePackages) {
      List<Packages> available =  availablePackages.stream()
              .sorted(Comparator.comparing(Packages::getPurchaseDate))
              .filter(t -> t.getRemaining() > 0)
              .collect(Collectors.toList());

      // no packages to charge
      if (available.isEmpty()) {
         return Pair.of(false, Pair.of(false, available));
      }

      Packages pck = availablePackages.get(0);
      if (pck.getRemaining() == 1) {
         available.remove(pck);
         return Pair.of(true, Pair.of(true, available));
      } else {
         pck.setRemaining(pck.getRemaining() - 1);
         return Pair.of(true, Pair.of(false, available));
      }
   }
}
