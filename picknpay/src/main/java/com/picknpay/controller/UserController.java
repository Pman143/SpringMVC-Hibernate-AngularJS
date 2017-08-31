package com.picknpay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.picknpay.form.UserForm;
import com.picknpay.model.User;
import com.picknpay.service.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService service;
        
     
	
        @RequestMapping(value = "/isvalid", method = RequestMethod.POST)
	public User isValid(@RequestBody User user){
		
		User us= service.isValidUser(user.getEmailAddress(), user.getPassword());
		System.out.println(us.getEmailAddress()+" "+us.getPassword());
	
			return us;
		}
                
        
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public User createUser(@RequestBody UserForm user){
		User us=new User();
                
                us.setUserID(user.getUserID());
		us.setFirstName(user.getFirstName());
		us.setLastName(user.getLastName());
		us.setEmailAddress(user.getEmailAddress());
                us.setPassword(user.getPassword());
			
                
		int res= service.saveUser(us);
		if(res==1){
			return us;
		}
		return null;
	
		}
        
      /*  @RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public Product addProduct(@RequestBody ProductForm product){
		User us=new User();
                
                us.setUserID(user.getUserID());
		us.setFirstName(user.getFirstName());
		us.setLastName(user.getLastName());
		us.setEmailAddress(user.getEmailAddress());
                us.setPassword(user.getPassword());
			
                
		int res= service.saveUser(us);
		if(res==1){
			return us;
		}
		return null;
	
		}*/
        
      
        
        
     

}
