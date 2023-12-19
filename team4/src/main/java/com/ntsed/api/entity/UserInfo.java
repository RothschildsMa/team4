package com.ntsed.api.entity;



import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

/*
* author: セツ
* date:2023/12/13
* 
*/

@Data
public class UserInfo implements Serializable {
    
	  private Long employeeId;
	    
	    private String employeeName;
	   
	    private String deptId;
	    
	    private Integer delFlg;
	    
	    private String genderId;
	   
	    private String employeeTel;
	    
	    private Date entryDate;
	    
	    private Integer employeeAge;
	    
	    private String employeeMail;
	    
	    private Date updateDate;
	    
	    private Date createDate;
	    
	    private String createUser;
	    
	    private String loginUser;
	    
	    private String updateUser;
    
}