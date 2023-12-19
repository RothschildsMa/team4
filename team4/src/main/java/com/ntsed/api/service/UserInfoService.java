package com.ntsed.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntsed.api.entity.UserInfo;
import com.ntsed.api.dao.UserInfoMapper;
import com.ntsed.api.dto.UserAddRequest;
import com.ntsed.api.dto.UserUpdateRequest;


/*
* author: セツ
* date:2023/12/13
* 
*/

@Service
public class UserInfoService {

	@Autowired
    private UserInfoMapper userInfoMapper;
	
	public UserInfo findById(Long employeeId) {
        return userInfoMapper.findById(employeeId);
    }
	
	 public void save(UserAddRequest userAddRequest) {
	        userInfoMapper.save(userAddRequest);
	    }
	 
	 public void update(UserUpdateRequest userUpdateRequest) {
	        userInfoMapper.update(userUpdateRequest);
	    }
	
}
