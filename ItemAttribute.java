package com.walmart.cbt.model.v1.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemAttribute {

  private ProductAttribute productAttributes;

  private OfferAttribute offerAttributes;
}
