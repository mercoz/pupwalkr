package com.pupwalkr.worldpay;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponseCode {
   Approved(1),
   Declined(2),
   Error(3);

   private final int value;

   ResponseCode(int value) {
      this.value = value;
   }

   @JsonCreator
   public static ResponseCode fromValue(final int value) {
      for(ResponseCode code : ResponseCode.values()) {
         if (code.value == value) {
            return code;
         }
      }

      return null;
   }

   @JsonValue
   public int getValue() {
      return value;
   }
}
