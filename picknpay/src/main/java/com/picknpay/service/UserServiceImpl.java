package com.picknpay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picknpay.dao.UserDao;
import com.picknpay.model.Product;
import com.picknpay.model.User;

@Service("userService")

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
		
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
        /*sdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff*/
        
         
         /*dfgfrhjnrgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfajjjjjdtdjttt*/
        @Override
	public Product getProduct(String productName) {
		// TODO Auto-generated method stub
		return dao.getProduct(productName);
	}

        
        @Override
	public List<Product> getAllProducts(String productName) {
		// TODO Auto-generated method stub
		return dao.getAllProducts(productName);
	}



	@Override
	public User isValidUser(String email, String pass) {
		// TODO Auto-generated method stub
		return dao.validate(email, pass);
	}




	@Override
	public int saveUser(User user) {
        int res=0;
		try{
			
                 System.out.println("In Dao Services");
		 dao.saveUser(user);
		 res=1;
		}catch(Exception e){
			
			
			
		}
		return res;
		
	}
        
        @Override
	public int addProduct(Product product) {
        int res=0;
		try{
			
                 System.out.println("In Dao Services");
		 dao.addProduct(product);
		 res=1;
		}catch(Exception e){
			
			
			
		}
		return res;
		
	}       
   




	@Override
	public User getUserByEmailAddress(String emailAddress) {
		// TODO Auto-generated method stub
		return dao.getUserByEmailAddress(emailAddress);
	}




	



	
  
 
}
