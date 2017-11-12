package com.pupwalkr.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Booking {
   public String service;
   private int zip;
   private String serviceDate;
   private String serviceTime;
   private int selectedWalkerId;
   private List<LineItems> lineItems;
   private double totalCost;

   public String getService() {
      return service;
   }

   public void setService(String service) {
      this.service = service;
   }

   public int getZip() {
      return zip;
   }

   public void setZip(int zip) {
      this.zip = zip;
   }

   public String getServiceDate() {
      return serviceDate;
   }

   public void setServiceDate(String serviceDate) {
      this.serviceDate = serviceDate;
   }

   public String getServiceTime() {
      return serviceTime;
   }

   public void setServiceTime(String serviceTime) {
      this.serviceTime = serviceTime;
   }

   public int getSelectedWalkerId() {
      return selectedWalkerId;
   }

   public void setSelectedWalkerId(int selectedWalkerId) {
      this.selectedWalkerId = selectedWalkerId;
   }

   public List<LineItems> getLineItems() {
      return lineItems;
   }

   public void setLineItems(List<LineItems> lineItems) {
      this.lineItems = lineItems;
   }

   public double getTotalCost() {
      return totalCost;
   }

   public void setTotalCost(double totalCost) {
      this.totalCost = totalCost;
   }
}
