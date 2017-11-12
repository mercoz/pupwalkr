package com.pupwalkr.worldpay;

public class ChargeCustomerResponse {
   private ResultType result;

   private ResponseCode responseCode;

   private String message;

   private Transaction transaction;

   public ResultType getResult() {
      return result;
   }

   public void setResult(ResultType result) {
      this.result = result;
   }

   public ResponseCode getResponseCode() {
      return responseCode;
   }

   public void setResponseCode(ResponseCode responseCode) {
      this.responseCode = responseCode;
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public Transaction getTransaction() {
      return transaction;
   }

   public void setTransaction(Transaction transaction) {
      this.transaction = transaction;
   }
}
