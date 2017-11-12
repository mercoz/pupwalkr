package com.pupwalkr;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pupwalkr.model.Packages;
import com.pupwalkr.model.User;
import com.pupwalkr.model.Walkr;
import com.pupwalkr.repository.UsersRepository;
import com.pupwalkr.worldpay.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
   private UsersRepository users;
   private final WorldPay worldPay;

   public HelloController(UsersRepository users, WorldPay worldPay) {
      this.users = users;
      this.worldPay = worldPay;
   }

   @RequestMapping("/reset")
   public String index() throws JsonProcessingException {
      User user = this.users.getOne(1);
      if (user == null) {
         return "The user is not in the db";
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

      customer.getUserDefinedFields().add(new UDF("udf1", "20"));

      this.worldPay.updateCustomer(worldPayId, customer);

      Card card = new Card();
      card.setNumber("4444 3333 2222 1111");
      card.setExpirationDate("04/2018");
      card.setFirstName(customer.getFirstName());
      card.setLastName(customer.getLastName());
      Address address = new Address();
      card.setAddress(address);
      address.setLine1("123 Main St.");
      address.setCity("Austin");
      address.setState("TX");
      address.setZip("78759");
      worldPay.createPaymentAccount(worldPayId, card);

      return "Reset data";
   }

}
