package com.picknpay.dao;

import com.picknpay.model.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
           
     @Autowired
      private SessionFactory sessionFactory;
               
        /*Product INFO*/
        
        @Override
         public List<Product> getProductsInfo() {       
           
            String hql="from Product";             
            Session sess=sessionFactory.getCurrentSession();
            Query qry=sess.createQuery(hql);     
            List alist=qry.list();
            System.out.println(alist.size());
            
              return alist;
            }
         
           /*Product INFO*/
         
         @Override
         public void addProduct(Product product){
             Session sess=sessionFactory.getCurrentSession();
             sess.save(product); 
             System.out.println("In Dao Implementation");
                         
                          
          }
         
        @Override
	public Product getProductId(String productId) {
		Session sess=sessionFactory.getCurrentSession();
		Product prod=(Product) sess.load(Product.class, productId);
		return prod;
	}
         

	
}
