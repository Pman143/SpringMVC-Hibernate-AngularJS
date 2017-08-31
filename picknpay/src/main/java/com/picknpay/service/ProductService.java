package com.picknpay.service;

import com.picknpay.model.Product;
import java.util.List;

public interface ProductService {

		       
        public List<Product> getProductsInfo();
        public int addProduct(Product product);
        public Product getProductId(String productId);
	
     
}
