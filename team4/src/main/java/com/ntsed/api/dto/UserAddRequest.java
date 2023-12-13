package com.ntsed.api.dto;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.Size;
import lombok.Data;

/*
 * author: セツ
 * date:2023/12/12
 * 
*/

@Data
public class UserAddRequest implements Serializable {
   
    @NotEmpty(message = "氏名を入力してください")
    @Size(max = 20, message = "氏名は20桁以内で入力してください")
    private String EMPLOYEE_NAME;
   
 
    private String DEPT_ID;
    
    @NotEmpty(message = "性別を選択してください。")
    private String GENDER_ID;
    

    private String EMPLOYEE_TEL;
    
    private String ENTRY_DATE;
    
    @Column(length = 2)
    private Integer EMPLOYEE_AGE;
    
    private String EMPLOYEE_MAIL;
    
    
   
  
}