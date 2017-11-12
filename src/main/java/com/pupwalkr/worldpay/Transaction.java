package com.pupwalkr.worldpay;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Map;

public class Transaction {
   private int secureNetId;

   private TransactionType transactionType;

   private String responseText;

   private String orderId;

   private int transactionId;

   private String authorizationCode;

   private double authorizedAmount;

   private boolean allowedPartialCharges;

   private String paymentTypeCode;

   private String paymentTypeResult;

   private boolean level2Valid;

   private boolean level3Valid;

   private TransactionData transactionData;

   private SettlementData settlementData;

   private VaultData vaultData;

   private String creditCardType;

   private String cardNumber;

   private String avsCode;

   private String avsResult;

   private String cardholder_firstName;

   private String cardholder_lastName;

   private String expirationDate;

   private Address billAddress;

   private String email;

   private String cardCodeCode;

   private String cardCodeResult;

   private String accountName;

   private String accountType;

   private String accountNumber;

   private String  checkNumber;

   private String traceNumber;

   private String surchargeAmount;

   private String cashBackAmount;

   private String gratuity;

   private String industrySpecificData;

   private String networkCode;

   private double additionalAmount;

   private String method;

   private String customerId;

   private boolean emailReceipt;

   private String fleetCardInfo;

   private String fnsNumber;

   private String voucherNumber;

   private String additionalData1;

   private String additionalData2;

   private String additionalData3;

   private String additionalData4;

   private String additionalData5;

   private String softDescriptor;

   private String dynamicMCC;

   @JsonDeserialize(using = ArrayMapDeserializer.class)
   private Map<String, String> userDefinedFields;

   private String notes;

   private String invoiceDescription;

   private int CATIndicator;

   private String callId;

   public int getSecureNetId() {
      return secureNetId;
   }

   public void setSecureNetId(int secureNetId) {
      this.secureNetId = secureNetId;
   }

   public TransactionType getTransactionType() {
      return transactionType;
   }

   public void setTransactionType(TransactionType transactionType) {
      this.transactionType = transactionType;
   }

   public String getResponseText() {
      return responseText;
   }

   public void setResponseText(String responseText) {
      this.responseText = responseText;
   }

   public String getOrderId() {
      return orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public int getTransactionId() {
      return transactionId;
   }

   public void setTransactionId(int transactionId) {
      this.transactionId = transactionId;
   }

   public String getAuthorizationCode() {
      return authorizationCode;
   }

   public void setAuthorizationCode(String authorizationCode) {
      this.authorizationCode = authorizationCode;
   }

   public double getAuthorizedAmount() {
      return authorizedAmount;
   }

   public void setAuthorizedAmount(double authorizedAmount) {
      this.authorizedAmount = authorizedAmount;
   }

   public boolean isAllowedPartialCharges() {
      return allowedPartialCharges;
   }

   public void setAllowedPartialCharges(boolean allowedPartialCharges) {
      this.allowedPartialCharges = allowedPartialCharges;
   }

   public String getPaymentTypeCode() {
      return paymentTypeCode;
   }

   public void setPaymentTypeCode(String paymentTypeCode) {
      this.paymentTypeCode = paymentTypeCode;
   }

   public String getPaymentTypeResult() {
      return paymentTypeResult;
   }

   public void setPaymentTypeResult(String paymentTypeResult) {
      this.paymentTypeResult = paymentTypeResult;
   }

   public boolean isLevel2Valid() {
      return level2Valid;
   }

   public void setLevel2Valid(boolean level2Valid) {
      this.level2Valid = level2Valid;
   }

   public boolean isLevel3Valid() {
      return level3Valid;
   }

   public void setLevel3Valid(boolean level3Valid) {
      this.level3Valid = level3Valid;
   }

   public TransactionData getTransactionData() {
      return transactionData;
   }

   public void setTransactionData(TransactionData transactionData) {
      this.transactionData = transactionData;
   }

   public SettlementData getSettlementData() {
      return settlementData;
   }

   public void setSettlementData(SettlementData settlementData) {
      this.settlementData = settlementData;
   }

   public VaultData getVaultData() {
      return vaultData;
   }

   public void setVaultData(VaultData vaultData) {
      this.vaultData = vaultData;
   }

   public String getCreditCardType() {
      return creditCardType;
   }

   public void setCreditCardType(String creditCardType) {
      this.creditCardType = creditCardType;
   }

   public String getCardNumber() {
      return cardNumber;
   }

   public void setCardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
   }

   public String getAvsCode() {
      return avsCode;
   }

   public void setAvsCode(String avsCode) {
      this.avsCode = avsCode;
   }

   public String getAvsResult() {
      return avsResult;
   }

   public void setAvsResult(String avsResult) {
      this.avsResult = avsResult;
   }

   public String getCardholder_firstName() {
      return cardholder_firstName;
   }

   public void setCardholder_firstName(String cardholder_firstName) {
      this.cardholder_firstName = cardholder_firstName;
   }

   public String getCardholder_lastName() {
      return cardholder_lastName;
   }

   public void setCardholder_lastName(String cardholder_lastName) {
      this.cardholder_lastName = cardholder_lastName;
   }

   public String getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(String expirationDate) {
      this.expirationDate = expirationDate;
   }

   public Address getBillAddress() {
      return billAddress;
   }

   public void setBillAddress(Address billAddress) {
      this.billAddress = billAddress;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getCardCodeCode() {
      return cardCodeCode;
   }

   public void setCardCodeCode(String cardCodeCode) {
      this.cardCodeCode = cardCodeCode;
   }

   public String getCardCodeResult() {
      return cardCodeResult;
   }

   public void setCardCodeResult(String cardCodeResult) {
      this.cardCodeResult = cardCodeResult;
   }

   public String getAccountName() {
      return accountName;
   }

   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   public String getAccountType() {
      return accountType;
   }

   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
   }

   public String getCheckNumber() {
      return checkNumber;
   }

   public void setCheckNumber(String checkNumber) {
      this.checkNumber = checkNumber;
   }

   public String getTraceNumber() {
      return traceNumber;
   }

   public void setTraceNumber(String traceNumber) {
      this.traceNumber = traceNumber;
   }

   public String getSurchargeAmount() {
      return surchargeAmount;
   }

   public void setSurchargeAmount(String surchargeAmount) {
      this.surchargeAmount = surchargeAmount;
   }

   public String getCashBackAmount() {
      return cashBackAmount;
   }

   public void setCashBackAmount(String cashBackAmount) {
      this.cashBackAmount = cashBackAmount;
   }

   public String getGratuity() {
      return gratuity;
   }

   public void setGratuity(String gratuity) {
      this.gratuity = gratuity;
   }

   public String getIndustrySpecificData() {
      return industrySpecificData;
   }

   public void setIndustrySpecificData(String industrySpecificData) {
      this.industrySpecificData = industrySpecificData;
   }

   public String getNetworkCode() {
      return networkCode;
   }

   public void setNetworkCode(String networkCode) {
      this.networkCode = networkCode;
   }

   public double getAdditionalAmount() {
      return additionalAmount;
   }

   public void setAdditionalAmount(double additionalAmount) {
      this.additionalAmount = additionalAmount;
   }

   public String getMethod() {
      return method;
   }

   public void setMethod(String method) {
      this.method = method;
   }

   public String getCustomerId() {
      return customerId;
   }

   public void setCustomerId(String customerId) {
      this.customerId = customerId;
   }

   public boolean isEmailReceipt() {
      return emailReceipt;
   }

   public void setEmailReceipt(boolean emailReceipt) {
      this.emailReceipt = emailReceipt;
   }

   public String getFleetCardInfo() {
      return fleetCardInfo;
   }

   public void setFleetCardInfo(String fleetCardInfo) {
      this.fleetCardInfo = fleetCardInfo;
   }

   public String getFnsNumber() {
      return fnsNumber;
   }

   public void setFnsNumber(String fnsNumber) {
      this.fnsNumber = fnsNumber;
   }

   public String getVoucherNumber() {
      return voucherNumber;
   }

   public void setVoucherNumber(String voucherNumber) {
      this.voucherNumber = voucherNumber;
   }

   public String getAdditionalData1() {
      return additionalData1;
   }

   public void setAdditionalData1(String additionalData1) {
      this.additionalData1 = additionalData1;
   }

   public String getAdditionalData2() {
      return additionalData2;
   }

   public void setAdditionalData2(String additionalData2) {
      this.additionalData2 = additionalData2;
   }

   public String getAdditionalData3() {
      return additionalData3;
   }

   public void setAdditionalData3(String additionalData3) {
      this.additionalData3 = additionalData3;
   }

   public String getAdditionalData4() {
      return additionalData4;
   }

   public void setAdditionalData4(String additionalData4) {
      this.additionalData4 = additionalData4;
   }

   public String getAdditionalData5() {
      return additionalData5;
   }

   public void setAdditionalData5(String additionalData5) {
      this.additionalData5 = additionalData5;
   }

   public String getSoftDescriptor() {
      return softDescriptor;
   }

   public void setSoftDescriptor(String softDescriptor) {
      this.softDescriptor = softDescriptor;
   }

   public String getDynamicMCC() {
      return dynamicMCC;
   }

   public void setDynamicMCC(String dynamicMCC) {
      this.dynamicMCC = dynamicMCC;
   }

   public Map<String, String> getUserDefinedFields() {
      return userDefinedFields;
   }

   public void setUserDefinedFields(Map<String, String> userDefinedFields) {
      this.userDefinedFields = userDefinedFields;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getInvoiceDescription() {
      return invoiceDescription;
   }

   public void setInvoiceDescription(String invoiceDescription) {
      this.invoiceDescription = invoiceDescription;
   }

   public int getCATIndicator() {
      return CATIndicator;
   }

   public void setCATIndicator(int CATIndicator) {
      this.CATIndicator = CATIndicator;
   }

   public String getCallId() {
      return callId;
   }

   public void setCallId(String callId) {
      this.callId = callId;
   }
}
