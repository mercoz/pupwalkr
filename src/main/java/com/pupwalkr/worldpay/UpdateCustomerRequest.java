package com.pupwalkr.worldpay;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.Map;

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
   private List<UDF> userDefinedFields;
   private int customerDuplicateCheckIndicator;

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public DeveloperApplication getDeveloperApplication() {
      return developerApplication;
   }

   public void setDeveloperApplication(DeveloperApplication developerApplication) {
      this.developerApplication = developerApplication;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public String getEmailAddress() {
      return emailAddress;
   }

   public void setEmailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
   }

   public boolean isSendEmailReceipts() {
      return sendEmailReceipts;
   }

   public void setSendEmailReceipts(boolean sendEmailReceipts) {
      this.sendEmailReceipts = sendEmailReceipts;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public int getCustomerDuplicateCheckIndicator() {
      return customerDuplicateCheckIndicator;
   }

   public void setCustomerDuplicateCheckIndicator(int customerDuplicateCheckIndicator) {
      this.customerDuplicateCheckIndicator = customerDuplicateCheckIndicator;
   }

   public List<UDF> getUserDefinedFields() {
      return userDefinedFields;
   }

   public void setUserDefinedFields(List<UDF> userDefinedFields) {
      this.userDefinedFields = userDefinedFields;
   }
}
