package com.ntsed.api.entity;

//import java.sql.Date;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/*
 * author: 高根沢
 * date:2023/12/22
 * 
*/

@Entity

//@Table(name = "t_employee")
@Table(name = "T_EMPLOYEE")

@Getter

@Setter
public class EmployeeListInfo {

	/*
	 * @Id private Long employeeId;
	 * 
	 * private String employeeName;
	 * 
	 * private String password;
	 * 
	 * private Integer deptId;
	 * 
	 * private Integer delFlg;
	 * 
	 * private Integer genderId;
	 * 
	 * private String employeeTel;
	 * 
	 * private Date entryDate;
	 * 
	 * private Integer employeeAge;
	 * 
	 * private String employeeMail;
	 * 
	 * private Date createDate;
	 * 
	 * private Date createUser;
	 * 
	 * private Date update_date;
	 * 
	 * private Date update_user;
	 */
	@Id
	private Long EMPLOYEE_ID;
	private String EMPLOYEE_NAME;
	private Date ENTRY_DATE;
	private Integer GENDER_ID;
	private Integer EMPLOYEE_AGE;
	private Integer DEPT_ID;
	private String EMPLOYEE_MAIL;
//	private String password;
//	private Integer deptId;
//	private Integer delFlg;
//	private Integer genderId;
//	private String employeeTel;
//	private Date entryDate;
//	private Integer employeeAge;
//	private String employeeMail;
//	private Date createDate;
//	private Date createUser;
//	private Date update_date;
//	private Date update_user;
}

