package com.pupwalkr.worldpay;

import java.time.LocalDateTime;

public class SettlementData {
   private LocalDateTime date;
   private double amount;
   private int batchId;

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

   public int getBatchId() {
      return batchId;
   }

   public void setBatchId(int batchId) {
      this.batchId = batchId;
   }
}
