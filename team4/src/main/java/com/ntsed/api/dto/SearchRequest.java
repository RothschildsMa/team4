package com.ntsed.api.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SearchRequest implements Serializable{

	private Long employeeId;
	private Integer deptId;
	private String startDate;
	private String endDate;
}
