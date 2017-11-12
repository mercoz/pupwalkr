package com.pupwalkr.worldpay;

import java.time.LocalDateTime;

public class TransactionData {
   private LocalDateTime date;
   private double amount;

   public LocalDateTime getDate() {
      return date;
   }

   public void setDate(LocalDateTime date) {
      this.date = date;
   }

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }
}
