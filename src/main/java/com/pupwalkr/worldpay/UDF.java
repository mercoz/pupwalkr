package com.pupwalkr.worldpay;

public class UDF {
   private String udfName;
   private String udfValue;

   public UDF() {

   }

   public UDF(String udfName, String udfValue) {
      this.udfName = udfName;
      this.udfValue = udfValue;
   }

   public String getUdfName() {
      return udfName;
   }

   public void setUdfName(String udfName) {
      this.udfName = udfName;
   }

   public String getUdfvalue() {
      return udfValue;
   }

   public void setUdfValue(String udfValue) {
      this.udfValue = udfValue;
   }
}
