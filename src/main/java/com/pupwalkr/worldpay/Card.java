package com.pupwalkr.worldpay;

public class Card {
   private String trackData;
   private String number;
   private String cvv;
   private String expirationDate;
   private String creditCardType;
   private String firstName;
   private String lastName;
   private Address address;

   public String getTrackData() {
      return trackData;
   }

   public void setTrackData(String trackData) {
      this.trackData = trackData;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public String getCvv() {
      return cvv;
   }

   public void setCvv(String cvv) {
      this.cvv = cvv;
   }

   public String getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
   }

   public String getCreditCardType() {
      return creditCardType;
   }

   public void setCreditCardType(String creditCardType) {
      this.creditCardType = creditCardType;
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
}
