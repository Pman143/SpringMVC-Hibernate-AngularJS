package com.picknpay.dao;

import com.picknpay.model.Product;
import java.util.List;

import com.picknpay.model.User;

public interface UserDao {

public User validate(String emailAddress,String password);
	public void saveUser(User user);
	
	public User getUserByEmailAddress(String EmailADdress);
        public List<Product> getAllProducts(String productName);	
	public List<User> getAllUser(String emailAddress);
	public User getUser(int userID);
        public void addProduct(Product product);
        public Product getProduct(String productName);
         
      

}
