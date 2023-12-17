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
 * date:2023/12/18
 * 
*/

@Entity

//@Table(name = "t_employee")
@Table(name = "T_EMPLOYEE")

@Getter

@Setter
public class EmployeeListInfo {

	@Id
	private Long T_EMPLOYEE;

	private String EMPLOYEE_NAME;

	private Date ENTRY_DATE;

	private Integer DEPT_ID;

	private Integer DEL_FLG;

	private Integer GENDER_ID;

//	private String EMPLOYEE_TEL;

	private Integer EMPLOYEE_AGE;

	private String EMPLOYEE_MAIL;

//	private Date UPDATE_DATE;

//	private Date CREATE_DATE;
	
	
}

