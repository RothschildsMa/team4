package com.ntsed.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ntsed.api.dto.SearchRequest;
import com.ntsed.api.entity.EmployeeListInfo;

@Mapper
public interface EmpMapper {
	
	List<EmployeeListInfo> getAll();
	
	List<EmployeeListInfo> searchList(SearchRequest searchRequest);

}
