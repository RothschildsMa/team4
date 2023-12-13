package com.ntsed.api.entity;



import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/*
* author: セツ
* date:2023/12/13
* 
*/

@Data
public class UserInfo implements Serializable {
    
    private Long EMPLOYEE_ID;
    
    private String EMPLOYEE_NAME;
   
    private String DEPT_ID;
    
    private Integer DEL_FLG;
    
    private String GENDER_ID;
   
    private String EMPLOYEE_TEL;
    
    private String ENTRY_DATE;
    
    private Integer EMPLOYEE_AGE;
    
    private String EMPLOYEE_MAIL;
    
    private Date UPDATE_DATE;
    
    private Date CREATE_DATE;
    
}