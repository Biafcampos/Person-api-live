package com.illusendtech.personapi.dto.request;


import com.illusendtech.personapi.enums.PhoneType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private  Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotNull
    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

}
