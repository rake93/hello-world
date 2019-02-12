package com.walmart.cbt.model.v1.constant;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ChargeCategory {
  Product(0),
  Shipping(1),
  Fee(2);
  int chargeCategory;
}
