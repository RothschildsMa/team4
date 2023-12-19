package com.ntsed.api.dto;


import java.io.Serializable;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
/*
 * author: セツ
 * date:2023/12/12
 * 
*/

@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserAddRequest implements Serializable {
 
    @NotNull
    private Long employeeId;
}