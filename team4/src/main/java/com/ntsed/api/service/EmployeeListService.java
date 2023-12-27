package com.ntsed.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ntsed.api.dao.EmpMapper;
import com.ntsed.api.dto.SearchRequest;
import com.ntsed.api.entity.EmployeeListInfo;
import com.ntsed.api.repository.EmployeeListRepository;

import lombok.RequiredArgsConstructor;

/*
 * author: 高根沢
 * date:2023/12/18
 * 
*/

@Service

public class EmployeeListService {
    private final EmployeeListRepository employeeRepository;
    private final EmpMapper empMapper;

	/* @Autowired */
    public EmployeeListService(EmployeeListRepository employeeRepository,EmpMapper empMapper) {
        this.employeeRepository = employeeRepository;
		this.empMapper = empMapper;
    }

    public List<EmployeeListInfo> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public List<EmployeeListInfo> getAll() {
        return empMapper.getAll();
    }
    
    public List<EmployeeListInfo> search(SearchRequest searchRequest) {
        return empMapper.searchList(searchRequest);
    }
    
    
}