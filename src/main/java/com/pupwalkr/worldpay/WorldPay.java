package com.pupwalkr.worldpay;

import com.pupwalkr.model.Walkr;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class WorldPay {
   private final String createCustomer = "https://gwapi.demo.securenet.com/api/Customers";
   private final String createPaymentAccount = "https://gwapi.demo.securenet.com/api/Customers/{customerId}/PaymentMethod";

   private RestTemplate rest;


   public WorldPay(RestTemplate rest) {
      this.rest = rest;
   }

   public void createCustomer(Walkr walker) {
      CreateCustomerRequest request = new CreateCustomerRequest();
      request.setDeveloperApplication(new DeveloperApplication());
      request.setFirstName(walker.getFirstName());
      request.setLastName(walker.getLastName());
      request.setCustomerId(Integer.toString(walker.getWalkrId()));
      request.setCustomerDuplicateCheckIndicator(1);

      ResponseEntity<CreateCustomerResponse> response = rest.postForEntity(createCustomer, request, CreateCustomerResponse.class);
      hashCode();
   }

   public void getCustomer(final int customerId) {

   }

   public void createPaymentAccount(final int customerId, final Card card) {
      CreateVaultAccountRequest request = new CreateVaultAccountRequest();
      request.setCustomerId(Integer.toString(customerId));
      request.setDeveloperApplication(new DeveloperApplication());
      request.setCard(card);
      request.setAccountDuplicateCheckIndicator(0);

      ResponseEntity<CreateVaultAccountResponse> response =  rest.postForEntity(createPaymentAccount, request, CreateVaultAccountResponse.class, customerId);
      hashCode();
   }
}
