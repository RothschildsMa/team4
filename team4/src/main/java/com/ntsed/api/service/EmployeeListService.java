package com.ntsed.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ntsed.api.entity.EmployeeListInfo;
import com.ntsed.api.repository.EmployeeListRepository;

/*
 * author: 高根沢
 * date:2023/12/18
 * 
*/

@Service
public class EmployeeListService {
    private final EmployeeListRepository employeeRepository;

	/* @Autowired */
    public EmployeeListService(EmployeeListRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeListInfo> getAllEmployees() {
        return employeeRepository.findAll();
    }
}