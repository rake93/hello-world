package com.walmart.cbt.model.v1.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductAttribute {

  private String itemImageUrl;

  private String productName;

  private String itemNumber;

  private String upc;

  private String partnerItemId;
}
