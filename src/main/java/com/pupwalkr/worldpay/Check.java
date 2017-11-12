package com.pupwalkr.worldpay;

public class Check {
   private AccountType accountType;
   private CheckType checkType;
   private String routingNumber;
   private String accountNumber;
   private String checkNumber;
   private Address address;
   private String firstName;
   private String lastName;
   private String email;
   private boolean emailReceipt;

   public AccountType getAccountType() {
      return accountType;
   }

   public void setAccountType(AccountType accountType) {
      this.accountType = accountType;
   }

   public CheckType getCheckType() {
      return checkType;
   }

   public void setCheckType(CheckType checkType) {
      this.checkType = checkType;
   }

   public String getRoutingNumber() {
      return routingNumber;
   }

   public void setRoutingNumber(String routingNumber) {
      this.routingNumber = routingNumber;
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getCheckNumber() {
      return checkNumber;
   }

   public void setCheckNumber(String checkNumber) {
      this.checkNumber = checkNumber;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
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

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isEmailReceipt() {
      return emailReceipt;
   }

   public void setEmailReceipt(boolean emailReceipt) {
      this.emailReceipt = emailReceipt;
   }
}
