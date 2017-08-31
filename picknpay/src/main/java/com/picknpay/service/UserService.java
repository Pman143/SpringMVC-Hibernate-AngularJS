package com.picknpay.service;

import com.picknpay.model.Product;
import java.util.List;

import com.picknpay.model.User;

public interface UserService {

	public User isValidUser(String email,String pass);
	public int saveUser(User user);
	public User getUserByEmailAddress(String emailAddress);
	//public List<User> getAllUsers(String emailAddress);
	public Product getProduct(String productName);
        public List<Product> getAllProducts(String productName);
        public int addProduct(Product product);
        
       
     
}
