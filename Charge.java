package com.walmart.cbt.model.v1.common;

import com.walmart.cbt.model.v1.constant.ChargeCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Charge {

  ChargeCategory chargeCategory;

  String chargName;

  boolean isAdjusted;

  Tax tax;

  boolean isDiscount;

  boolean isBillable;
}
