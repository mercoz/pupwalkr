package com.pupwalkr.worldpay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VaultCustomer {
   private String customerId;

   private Address address;

   private String firstName;

   private String lastName;

   private String emailAddress;

   private String sendEmailReceipts;

   private String company;

   private String notes;

   private List<VaultPaymentMethod> paymentMethods;

   private String primaryPaymentMethodId;

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
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

   public String getSendEmailReceipts() {
      return sendEmailReceipts;
   }

   public void setSendEmailReceipts(String sendEmailReceipts) {
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

   public List<VaultPaymentMethod> getPaymentMethods() {
      return paymentMethods;
   }

   public void setPaymentMethods(List<VaultPaymentMethod> paymentMethods) {
      this.paymentMethods = paymentMethods;
   }

   public String getPrimaryPaymentMethodId() {
      return primaryPaymentMethodId;
   }

   public void setPrimaryPaymentMethodId(String primaryPaymentMethodId) {
      this.primaryPaymentMethodId = primaryPaymentMethodId;
   }
}
