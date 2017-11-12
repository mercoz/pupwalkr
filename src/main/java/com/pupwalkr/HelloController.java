package com.pupwalkr;

import com.pupwalkr.model.User;
import com.pupwalkr.model.Walkr;
import com.pupwalkr.worldpay.Address;
import com.pupwalkr.worldpay.Card;
import com.pupwalkr.worldpay.WorldPay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   private final WorldPay worldPay;

   public HelloController(WorldPay worldPay) {
      this.worldPay = worldPay;
   }

   @RequestMapping("/")
   public String index() {
      User foo = new User();
      foo.setUserId(42);
      foo.setFirstName("Nathan");
      foo.setLastName("Melanson");
      worldPay.createCustomer(foo);

      Card card = new Card();
      card.setNumber("4444 3333 2222 1111");
      card.setExpirationDate("04/2018");
      card.setFirstName(foo.getFirstName());
      card.setLastName(foo.getLastName());
      Address address = new Address();
      card.setAddress(address);
      address.setLine1("123 Main St.");
      address.setCity("Austin");
      address.setState("TX");
      address.setZip("78759");
      worldPay.createPaymentAccount(42, card);

      return "Greetings from Spring Boot!";
   }

}
