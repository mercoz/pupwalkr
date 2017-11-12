package com.pupwalkr.worldpay;

public class CreateVaultAccountResponse {
   private ResultType result;

   private ResponseCode responseCode;

   private String message;

   private VaultPaymentMethod vaultPaymentMethod;

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

   public VaultPaymentMethod getVaultPaymentMethod() {
      return vaultPaymentMethod;
   }

   public void setVaultPaymentMethod(VaultPaymentMethod vaultPaymentMethod) {
      this.vaultPaymentMethod = vaultPaymentMethod;
   }
}
