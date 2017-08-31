
package com.picknpay.dao;

import com.picknpay.model.Product;
import java.util.List;

public interface ProductDao {
	       
        public List<Product> getProductsInfo();
        public void addProduct(Product product);
        public Product getProductId(String getProductName);
	

}
