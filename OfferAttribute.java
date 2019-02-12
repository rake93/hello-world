package com.walmart.cbt.model.v1.item;

import com.walmart.cbt.model.v1.constant.OfferType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OfferAttribute {

  private String offerId;

  private OfferType offerType;

  private String upc;
}
