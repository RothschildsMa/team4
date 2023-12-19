package com.ntsed.api.dto;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*
 * author: セツ
 * date:2023/12/12
 * 
*/

@Data
public class UserAddRequest implements Serializable {
   
private Long employeeId;
	
    @NotEmpty(message = "氏名を入力してください")
    @Size(max = 20, message = "氏名は20桁以内で入力してください")
    private String employeeName;
   
    @NotEmpty(message = "所属を選択してください。")
    private String deptId;
    
    @NotEmpty(message = "性別を選択してください。")
    private String genderId;
    
  @Size(max = 11, min=10,message = "正しい電話番号を入力してください。")
    private String employeeTel;
    
    private Integer delFlg;
    

    private Date entryDate;
    

    @Column(length = 2)
    private Integer employeeAge;
    
    @Pattern(regexp = "^([\\w])+([\\w\\._-])*\\@([\\w])+([\\w\\._-])*\\.([a-zA-Z])+$",message ="正しいメールアドレスはを入力してください。")
    private String employeeMail;
    
    private String createUser;
    
    private Date createDate;
    
    private String loginUser;
    
    
   
  
}