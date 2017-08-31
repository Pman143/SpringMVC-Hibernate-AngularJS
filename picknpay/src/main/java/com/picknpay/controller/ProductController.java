package com.picknpay.controller;

import com.picknpay.form.ProductForm;
import com.picknpay.model.Product;
import com.picknpay.service.ProductService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

        
                @Autowired
                private ProductService pservice;
	        
                /*------------------- Get all users --------------------------------------------------------*/
                @RequestMapping(value = "/getProductsInfo", method = RequestMethod.POST)
                public List<Product> getProductsInfo(@RequestBody Product product){
                       
                        List<Product> list=new ArrayList<Product>();
                        list=pservice.getProductsInfo();
                        return list;
           
                }
                
                
                /*-------------------------------Adding Products---------------------------*/
                
                @RequestMapping( value="/addProduct", method = RequestMethod.POST)
                public Product addProduct(@RequestBody ProductForm product){
                    
                    Product prod=new Product();
                    
                    System.out.println("In Dao Controller");
                    
                    prod.setProductPrice(product.getProductPrice());
                    prod.setProductName(product.getProductName());
                    prod.setProductImageUrl(product.getProductImageUrl());
                    prod.setProductDescription(product.getProductDescription());
                    prod.setProductCategory(product.getProductCategory());
                    prod.setProductBrand(product.getProductBrand());
                    prod.setUserID(product.getUserID());
                    prod.setProductQuantity(product.getProductQuantity());
                    
                    int res=pservice.addProduct(prod);
                    
                    if(res==1){
                        
                        return prod;
                        
                           }
                    
                    return null;
                    
                       }    
                
        @RequestMapping(value = "/getProductId", method = RequestMethod.POST)
	public Product getProductDetail(@RequestBody Product product){
	Product prod=new Product();
	prod=pservice.getProductId(product.getProductName());        
		return prod;
	}    
                
                
                
                
}