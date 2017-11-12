package com.pupwalkr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pupwalkr.dto.Booking;
import com.pupwalkr.model.Packages;
import com.pupwalkr.model.User;
import com.pupwalkr.repository.UsersRepository;
import com.pupwalkr.worldpay.VaultCustomer;
import com.pupwalkr.worldpay.WorldPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
   public ResponseEntity saveBookings(@PathVariable int customerId, @RequestBody Booking booking) {
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

      String json = customer.getUserDefinedFields().getOrDefault("packages", "[\n" +
              "  {\n" +
              "    \"id\": 12345,\n" +
              "    \"purchaseDate\": \"2017-11-11T21:34:55\",\n" +
              "    \"totalBookings\": 20,\n" +
              "    \"remaining\": 1,\n" +
              "    \"amountPerWalk\": 13.00\n" +
              "  }\n" +
              "]");

      try {
         ObjectMapper mapper = new ObjectMapper();
         mapper.registerModule(new JavaTimeModule());
         List<Packages> packages = mapper.readValue(json, new TypeReference<List<Packages>>(){});
         Pair<Boolean, Pair<Boolean, List<Packages>>> toCharge = this.findAvailableAndSubtract(packages);
         if (!toCharge.getFirst()) {
            // nothing to charge
            return new ResponseEntity<>(HttpStatus.PAYMENT_REQUIRED);
         } else if (toCharge.getSecond().getFirst()) {
            // need to fill up
         } else {
            // just update
            this.worldPay.updateCustomer(worldPayId, customer);
         }
      } catch (IOException e) {
         e.printStackTrace();
         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }

      hashCode();
      return new ResponseEntity<>(HttpStatus.OK);
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
