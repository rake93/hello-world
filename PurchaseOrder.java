package com.walmart.cbt.model.v1.purchaseorder;

import com.walmart.cbt.model.v1.common.CustomAttribute;
import com.walmart.cbt.model.v1.common.StatusInfo;
import com.walmart.cbt.model.v1.common.Partner;
import com.walmart.cbt.model.v1.payment.PaymentMethod;
import lombok.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;



public class PurchaseOrder {

  String purchaseOrderNo;

  String sourceMarketOrderNo;

  String destinationMarketOrderNo;

  Partner partner;

  boolean isPreOrder;

  PaymentMethod paymentMethod;

  @Singular List<PurchaseOrderLine> purchaseOrderLines;

  CustomAttribute customAttribute;

  @Singular("statusInfo")
  List<StatusInfo> statusInfo;
  
  
  void setPurchaseOrderNo(String purchaseOrderNo) {
	  
	  
  }
  
}
