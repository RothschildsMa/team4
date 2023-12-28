package com.ntsed.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ntsed.api.dto.UserAddRequest;
import com.ntsed.api.dto.UserUpdateRequest;
import com.ntsed.api.entity.UserInfo;
import com.ntsed.api.service.UserInfoService;


/*
 * author: セツ
 * date:2023/12/13
 * 
*/
@Controller
public class UserInfoController {
	
	
	@Autowired
    private UserInfoService userInfoService;
	
	 @GetMapping(value = "/user/add")
	    public String displayAdd(Model model,UserAddRequest userAddRequest) {
		 userAddRequest.setEmployeeId(userInfoService.getMaxId());
		 
	        model.addAttribute("userAddRequest",userAddRequest );
	        return "user/add";
	    }
	 
	 @GetMapping("/user/{employeeId}/edit")
	    public String displayEdit(@PathVariable Long employeeId, Model model) {
	        UserInfo user = userInfoService.findById(employeeId);
	        UserUpdateRequest userUpdateRequest = new UserUpdateRequest();
	        userUpdateRequest.setEmployeeId(user.getEmployeeId());
	        userUpdateRequest.setEmployeeName(user.getEmployeeName());
	        userUpdateRequest.setDeptId(user.getDeptId());
	        userUpdateRequest.setGenderId(user.getGenderId());
	        userUpdateRequest.setEmployeeTel(user.getEmployeeTel());
	        userUpdateRequest.setEntryDate(user.getEntryDate());
	        userUpdateRequest.setEmployeeAge(user.getEmployeeAge());
	        userUpdateRequest.setEmployeeMail(user.getEmployeeMail());
	        
	        model.addAttribute("userUpdateRequest", userUpdateRequest);
	        return "user/edit";
	    }	 
	 
	 @RequestMapping(value = "/user/create", method = RequestMethod.POST)
	    public String create(@Validated @ModelAttribute UserAddRequest userRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	          
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "user/add";
	        }
	        
	        userInfoService.save(userRequest);
	        return "redirect:/user/list";
	    }	 
	 
	  @RequestMapping(value = "/user/update", method = RequestMethod.POST)
	    public String update(@Validated @ModelAttribute UserUpdateRequest userUpdateRequest, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            List<String> errorList = new ArrayList<String>();
	            for (ObjectError error : result.getAllErrors()) {
	                errorList.add(error.getDefaultMessage());
	            }
	            model.addAttribute("validationError", errorList);
	            return "user/edit";
	        }
	 
	        userInfoService.update(userUpdateRequest);
	        return "redirect:/user/list";
	    }	 
	
}
