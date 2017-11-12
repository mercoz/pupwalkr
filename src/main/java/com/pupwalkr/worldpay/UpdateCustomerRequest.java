package com.pupwalkr.worldpay;

public class UpdateCustomerRequest {
   private String customerId;
   private DeveloperApplication developerApplication;
   private String firstName;
   private String lastName;
   private String phoneNumber;
   private Address address;
   private String emailAddress;
   private boolean sendEmailReceipts;
   private String company;
   private String notes;
   private int customerDuplicateCheckIndicator;
}
