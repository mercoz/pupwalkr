package com.pupwalkr.worldpay;

public class VaultToken {
   private String customerId;
   private String paymentMethodId;

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public String getPaymentMethodId() {
      return paymentMethodId;
   }

   public void setPaymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
   }
}
