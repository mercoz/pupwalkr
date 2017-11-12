package com.pupwalkr.worldpay;

public class ChargeCustomerRequest {
   private double amount;

   private VaultToken paymentVaultToken;

   private DeveloperApplication developerApplication;

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public VaultToken getPaymentVaultToken() {
      return paymentVaultToken;
   }

   public void setPaymentVaultToken(VaultToken paymentVaultToken) {
      this.paymentVaultToken = paymentVaultToken;
   }

   public DeveloperApplication getDeveloperApplication() {
      return developerApplication;
   }

   public void setDeveloperApplication(DeveloperApplication developerApplication) {
      this.developerApplication = developerApplication;
   }
}
