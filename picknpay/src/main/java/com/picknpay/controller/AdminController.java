package com.picknpay.controller;


import com.picknpay.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.picknpay.service.AdminService;

@RestController

public class AdminController {

	@Autowired
	private AdminService service;
             	
        @RequestMapping(value = "/isAdminvalid", method = RequestMethod.POST)
	public Admin  isAdminValid(@RequestBody Admin admin){
		
		Admin ad= service.isValidUser(admin.getEmailAddress(), admin.getPassword());
		System.out.println(ad.getEmailAddress()+" "+ad.getPassword());
	
			return ad;
		}
                  
}
