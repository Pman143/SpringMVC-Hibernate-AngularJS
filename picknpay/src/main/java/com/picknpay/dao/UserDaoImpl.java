package com.picknpay.dao;

import com.picknpay.model.Product;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.picknpay.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	 @Autowired 
          private SessionFactory sessionFactory;
 /**********************Valid User To Database*********************/
	@Override
	public User validate(String emailAddress, String password) {
		Session sess=sessionFactory.getCurrentSession();
		String hql="FROM User u where u.emailAddress=:emailAddress and u.password=:password";
		Query query = sess.createQuery(hql);
		query.setParameter("emailAddress",emailAddress);
		query.setParameter("password",password);
		List results = query.list();
		User us=null;
		
		if(results.size()>0){
			us=(User) results.get(0);
			return us;
		}else{
			return us;
		}
		
	}
        
       
         
          /*42sd35f1.2ggggggggggggggggggggggggggggggggggggd*/
        @Override
	public Product getProduct(String productName) {
		Session sess=sessionFactory.getCurrentSession();
		Product prod=(Product) sess.load(Product.class, productName);
		return prod;
	}

        
         /**********************Saving User To Database*********************/

	@Override
	public void saveUser(User user) {
	Session sess=sessionFactory.getCurrentSession();	
	sess.save(user);
        System.out.println("In Dao implementation");
		
	}
        
        
        
       
        
         /**********************Adding Products To Databas*/
     
        
        @Override
	public void addProduct(Product product) {
	Session sess=sessionFactory.getCurrentSession();	
	sess.save(product);
        System.out.println("In Dao implementation");
		
	}
        
      
	@Override
	public User getUserByEmailAddress(String emailAddress) {
	String hql="from User u where u.emailAddress=:emailAddress";
	Session sess=sessionFactory.getCurrentSession();
	Query qry=sess.createQuery(hql);
	System.out.println("***"+emailAddress);
	qry.setString("emailAddress", emailAddress);
	User u=(User) qry.uniqueResult();

	return u;
	
	}
        /**********************Getting Products From Database*********************/
        
	@Override
	public List<Product> getAllProducts(String productName) {
	String hql="from Product a where a.prodName=:productName";
	Session sess=sessionFactory.getCurrentSession();
	Query qry=sess.createQuery(hql);
	System.out.println("***"+productName);
	qry.setString("productName", productName);
	List<Product> alist=qry.list();
	System.out.println(alist.size());
	return alist;
	}

    public List<User> getAllUser(String emailAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUser(int userID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
	
}
