package com.pupwalkr.worldpay;

public class UpdateCustomerResponse {
   private ResultType result;

   private ResponseCode responseCode;

   private String message;

   private String customerId;

   private VaultCustomer vaultCustomer;

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

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public VaultCustomer getVaultCustomer() {
      return vaultCustomer;
   }

   public void setVaultCustomer(VaultCustomer vaultCustomer) {
      this.vaultCustomer = vaultCustomer;
   }
}
