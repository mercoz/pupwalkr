package com.pupwalkr.model;

import java.time.LocalDateTime;

public class Packages {
   private int id;
   private LocalDateTime purchaseDate;
   private int totalBookings;
   private int remaining;
   private double amountPerWalk;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public LocalDateTime getPurchaseDate() {
      return purchaseDate;
   }

   public void setPurchaseDate(LocalDateTime purchaseDate) {
      this.purchaseDate = purchaseDate;
   }

   public int getTotalBookings() {
      return totalBookings;
   }

   public void setTotalBookings(int totalBookings) {
      this.totalBookings = totalBookings;
   }

   public int getRemaining() {
      return remaining;
   }

   public void setRemaining(int remaining) {
      this.remaining = remaining;
   }

   public double getAmountPerWalk() {
      return amountPerWalk;
   }

   public void setAmountPerWalk(double amountPerWalk) {
      this.amountPerWalk = amountPerWalk;
   }
}
