package com.pupwalkr.worldpay;

import com.pupwalkr.model.User;
import com.pupwalkr.model.Walkr;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WorldPay {
   private final String createCustomer = "https://gwapi.demo.securenet.com/api/Customers";
   private final String retrieveCustomer = "https://gwapi.demo.securenet.com/api/Customers/{customerId}";
   private final String updateCustomer = "https://gwapi.demo.securenet.com/api/Customers/{customerId}";
   private final String createPaymentAccount = "https://gwapi.demo.securenet.com/api/Customers/{customerId}/PaymentMethod";
   private final String chargeCustomer = "https://gwapi.demo.securenet.com/api/Payments/Charge";

   private RestTemplate rest;


   public WorldPay(RestTemplate rest) {
      this.rest = rest;
   }

   public VaultCustomer createCustomer(User user) {
      CreateCustomerRequest request = new CreateCustomerRequest();
      request.setDeveloperApplication(new DeveloperApplication());
      request.setFirstName(user.getFirstName());
      request.setLastName(user.getLastName());
      request.setEmailAddress(user.getEmail());
      request.setPhoneNumber(Long.toString(user.getCell()));
      request.setCustomerDuplicateCheckIndicator(1);

      ResponseEntity<CreateCustomerResponse> response = rest.postForEntity(createCustomer, request, CreateCustomerResponse.class);
      return response.getBody().getVaultCustomer();
   }

   public VaultCustomer getCustomer(final String customerId) {
      ResponseEntity<RetrieveCustomerResponse> response = rest.getForEntity(retrieveCustomer, RetrieveCustomerResponse.class, customerId);
      return response.getBody().getVaultCustomer();
   }

   public VaultCustomer updateCustomer(final String customerId, VaultCustomer customer) {
      UpdateCustomerRequest request = new UpdateCustomerRequest();
      request.setCustomerId(customerId);
      request.setDeveloperApplication(new DeveloperApplication());
      request.setFirstName(customer.getFirstName());
      request.setLastName(customer.getLastName());
      request.setAddress(customer.getAddress());
      request.setEmailAddress(customer.getEmailAddress());
      request.setUserDefinedFields(customer.getUserDefinedFields());

      ResponseEntity<UpdateCustomerResponse> response =  rest.postForEntity(updateCustomer, request, UpdateCustomerResponse.class, customerId);
      return response.getBody().getVaultCustomer();
   }

   public void chargeCustomer(final String customerId, final String paymentId, final double amount) {
      ChargeCustomerRequest request = new ChargeCustomerRequest();
      request.setAmount(amount);
      request.setDeveloperApplication(new DeveloperApplication());
      VaultToken token = new VaultToken();
      token.setCustomerId(customerId);
      token.setPaymentMethodId(paymentId);
      request.setPaymentVaultToken(token);
      ResponseEntity<ChargeCustomerResponse> response = rest.postForEntity(chargeCustomer, request, ChargeCustomerResponse.class);
   }

   public void createPaymentAccount(final int customerId, final Card card) {
      CreateVaultAccountRequest request = new CreateVaultAccountRequest();
      request.setCustomerId(Integer.toString(customerId));
      request.setDeveloperApplication(new DeveloperApplication());
      request.setCard(card);
      request.setAccountDuplicateCheckIndicator(0);

      ResponseEntity<CreateVaultAccountResponse> response =  rest.postForEntity(createPaymentAccount, request, CreateVaultAccountResponse.class, customerId);
   }

   public void createPaymentAccount(final int customerId, final Check check) {
      CreateVaultAccountRequest request = new CreateVaultAccountRequest();
      request.setCustomerId(Integer.toString(customerId));
      request.setDeveloperApplication(new DeveloperApplication());
      request.setCheck(check);
      request.setAccountDuplicateCheckIndicator(0);

      ResponseEntity<CreateVaultAccountResponse> response =  rest.postForEntity(createPaymentAccount, request, CreateVaultAccountResponse.class, customerId);
   }
}
