package com.walmart.cbt.model.v1.payment;

        import com.walmart.cbt.model.v1.common.Address;
        import com.walmart.cbt.model.v1.common.Email;
        import com.walmart.cbt.model.v1.common.Name;
        import com.walmart.cbt.model.v1.common.Phone;
        import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PersonInfoBillTo {

  Address address;

  Phone phone;

  Name name;

  Email email;
}
