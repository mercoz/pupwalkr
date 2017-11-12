package com.pupwalkr.worldpay;

public class CreateVaultAccountRequest {
   private String customerId;
   private DeveloperApplication developerApplication;
   private Card card;
   private int accountDuplicateCheckIndicator = 1;

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public DeveloperApplication getDeveloperApplication() {
      return developerApplication;
   }

   public void setDeveloperApplication(DeveloperApplication developerApplication) {
      this.developerApplication = developerApplication;
   }

   public Card getCard() {
      return card;
   }

   public void setCard(Card card) {
      this.card = card;
   }

   public int getAccountDuplicateCheckIndicator() {
      return accountDuplicateCheckIndicator;
   }

   public void setAccountDuplicateCheckIndicator(int accountDuplicateCheckIndicator) {
      this.accountDuplicateCheckIndicator = accountDuplicateCheckIndicator;
   }
}
