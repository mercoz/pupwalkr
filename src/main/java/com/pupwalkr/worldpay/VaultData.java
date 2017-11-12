package com.pupwalkr.worldpay;

public class VaultData {
   private VaultToken token;

   private String company;

   private String firstName;

   private String lastName;

   private String email;

   private String phone;

   public VaultToken getToken() {
      return token;
   }

   public void setToken(VaultToken token) {
      this.token = token;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
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

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
}
