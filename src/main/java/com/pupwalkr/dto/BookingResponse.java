package com.pupwalkr.dto;

public class BookingResponse {
   public String status;
   public String transactionId;
   public String creditsRemaining;

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getTransactionId() {
      return transactionId;
   }

   public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
   }

   public String getCreditsRemaining() {
      return creditsRemaining;
   }

   public void setCreditsRemaining(String creditsRemaining) {
      this.creditsRemaining = creditsRemaining;
   }
}
