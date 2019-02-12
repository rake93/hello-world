package com.walmart.cbt.model.v1.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentMethod {

  String paymentMethodId;

  String paymentReferenceId;

  PersonInfoBillTo personInfoBillTo;

  Transaction transactions;

  String paymentType;

  String last4DigitsOfCard;

  String paymentHandle;

  boolean isInstrumentValid;

  String instrumentExpiry;
}
