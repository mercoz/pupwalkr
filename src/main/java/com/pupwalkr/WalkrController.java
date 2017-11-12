package com.pupwalkr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalkrController {
   @RequestMapping("/walkerController")
   public String index() {
      return "Greetings from Spring Boot!";
   }
}
