package com.walmart.cbt.model.v1.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Amount {

  private long currencyAmount;

  private String currencyUnit;
}
