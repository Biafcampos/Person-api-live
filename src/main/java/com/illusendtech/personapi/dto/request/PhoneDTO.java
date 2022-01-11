package com.illusendtech.personapi.dto.request;


import com.illusendtech.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private  Long id;

    private PhoneType type;

    private String number;

}
