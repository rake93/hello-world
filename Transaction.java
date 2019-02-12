package com.walmart.cbt.model.v1.payment;

import com.walmart.cbt.model.v1.common.Amount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Transaction {

  private String transactionType;
  private Amount processedAmount;

  private String processedOn;

  private String transactionReference;

  private String requestedOn;
  private String status;

  private Amount requestedAmount;
}
