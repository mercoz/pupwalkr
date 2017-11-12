package com.pupwalkr.worldpay;

public class VaultPaymentMethod {
   private String customerId;
   private String paymentId;
   private Card card;
   private Check check;
   private String notes;
   private PaymentMethod method;
   private String primary;
   private String lastAccessDate;

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getPaymentId() {
      return paymentId;
   }

   public void setPaymentId(String paymentId) {
      this.paymentId = paymentId;
   }

   public Card getCard() {
      return card;
   }

   public void setCard(Card card) {
      this.card = card;
   }

   public Check getCheck() {
      return check;
   }

   public void setCheck(Check check) {
      this.check = check;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public PaymentMethod getMethod() {
      return method;
   }

   public void setMethod(PaymentMethod method) {
      this.method = method;
   }

   public String getPrimary() {
      return primary;
   }

   public void setPrimary(String primary) {
      this.primary = primary;
   }

   public String getLastAccessDate() {
      return lastAccessDate;
   }

   public void setLastAccessDate(String lastAccessDate) {
      this.lastAccessDate = lastAccessDate;
   }
}
