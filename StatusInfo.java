package com.walmart.cbt.model.v1.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StatusInfo {

  Quantity statusQuantity;

  String statusCode;

  String statusChangeDate;

  String statusDescription;

  String status;
}
