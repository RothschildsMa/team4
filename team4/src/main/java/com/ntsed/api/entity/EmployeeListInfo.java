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

	@Id
	private Long employeeId;
	private String employeeName;
	private Date entryDate;
	private Integer genderId;
	private Integer employeeAge;
	private Integer deptId;
	private String employeeMail;
	
	
}

