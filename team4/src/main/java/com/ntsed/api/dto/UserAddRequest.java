package com.ntsed.api.dto;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
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

	private Integer employeeId;

	@NotEmpty(message = "氏名を入力してください")
	@Size(max = 20, message = "氏名は20桁以内で入力してください")
	private String employeeName;

	@NotEmpty(message = "所属を選択してください。")
	private String deptId;

	@NotEmpty(message = "性別を選択してください。")
	private String genderId;

	@Pattern(regexp = "^$|.{10,11}", message = "正しい電話番号を入力してください。")
	private String employeeTel;

	private Integer delFlg;

	@Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date entryDate;

	@Min(value = 10, message = "年齢は2桁を入力してください。")
	@Max(value = 99, message = "年齢は2桁を入力してください。")
	private Integer employeeAge;

	@Email(message = "正しいメールアドレスはを入力してください。")
	private String employeeMail;

	private String createUser;

	private Date createDate;

	private String loginUser;

}