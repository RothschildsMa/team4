package com.ntsed.api.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ntsed.api.entity.UserInfo;
import com.ntsed.api.dto.UserAddRequest;
import com.ntsed.api.dto.UserUpdateRequest;

@Mapper
public interface UserInfoMapper {

	UserInfo findById(Long employeeId);
	
	void save(UserAddRequest userRequest);
	
	void update(UserUpdateRequest userUpdateRequest);
}
