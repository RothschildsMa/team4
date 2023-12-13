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
	    public String displayAdd(Model model) {
	        model.addAttribute("userAddRequest", new UserAddRequest());
	        return "user/add";
	    }
	 
	 @GetMapping("/user/{EMPLOYEE_ID}/edit")
	    public String displayEdit(@PathVariable Long EMPLOYEE_ID, Model model) {
	        UserInfo user = userInfoService.findById(EMPLOYEE_ID);
	        UserUpdateRequest userUpdateRequest = new UserUpdateRequest();
	        userUpdateRequest.setEMPLOYEE_ID(user.getEMPLOYEE_ID());
	        userUpdateRequest.setEMPLOYEE_NAME(user.getEMPLOYEE_NAME());
	        userUpdateRequest.setDEPT_ID(user.getDEPT_ID());
	        userUpdateRequest.setGENDER_ID(user.getGENDER_ID());
	        userUpdateRequest.setEMPLOYEE_TEL(user.getEMPLOYEE_TEL());
	        userUpdateRequest.setENTRY_DATE(user.getENTRY_DATE());
	        userUpdateRequest.setEMPLOYEE_AGE(user.getEMPLOYEE_AGE());
	        userUpdateRequest.setEMPLOYEE_MAIL(user.getEMPLOYEE_MAIL());
	        
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
