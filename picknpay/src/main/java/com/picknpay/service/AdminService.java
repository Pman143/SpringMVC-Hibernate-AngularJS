
package com.picknpay.service;


import com.picknpay.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picknpay.model.Admin;

@Service("adminService")

public class AdminService{

	@Autowired
	private AdminDao dao;
	
		
	public void setDao(AdminDao dao) {
		this.dao = dao;
	}




	
	public Admin isValidUser(String email, String pass) {
		// TODO Auto-generated method stub
		return dao.validate(email, pass);
	}


 
}
