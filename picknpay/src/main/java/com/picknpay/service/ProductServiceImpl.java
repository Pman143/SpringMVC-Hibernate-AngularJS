package com.picknpay.service;

import com.picknpay.dao.ProductDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picknpay.model.Product;
import java.util.List;


@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pao;
	      
        public void setDao(ProductDao pao) {
		this.pao = pao;
	}
                      
           /*Getting Products*/
                         
         @Override
         public List<Product> getProductsInfo() {
             
          return pao.getProductsInfo();
        }
         
         /*Getting Products*/
         @Override
         public int addProduct(Product product){
             
             int res=0;
             
             try {
                 System.out.println("In Dao Services");
                 pao.addProduct(product);
                 res=1;
             } catch (Exception e) {
             }
             
             return res;
         }
         
         
         @Override
	 public Product getProductId(String productId) {
		// TODO Auto-generated method stub
		return pao.getProductId(productId);
	}
  
       
}
