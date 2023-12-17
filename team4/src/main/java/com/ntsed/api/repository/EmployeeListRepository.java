package com.ntsed.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntsed.api.entity.EmployeeListInfo;

/*
 * author: 高根沢
 * date:2023/12/18
 * 
*/

public interface EmployeeListRepository extends JpaRepository<EmployeeListInfo, Long> {
    // ここに必要なクエリメソッドを追加
	
}
