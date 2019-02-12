package com.walmart.cbt.model.v1.purchaseorder;

import com.walmart.cbt.model.v1.common.*;
import com.walmart.cbt.model.v1.item.ItemAttribute;
import com.walmart.cbt.model.v1.payment.PaymentMethod;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PurchaseOrderLine {

  String poLineId;

  String sourceMarketPoLineId;

  String destinationMarketPoLineId;

  boolean isPreOrder;

  ItemAttribute itemAttributes;

  PaymentMethod paymentMethod;

  Quantity orderedQty;

  Amount unitPrice;

  Charge totalCharge;

  @Singular List<Charge> charges;

  CustomAttribute orderLineCustomAttributes;

  @Singular("statusInfo")
  List<StatusInfo> poLineStatusInfos;
}
