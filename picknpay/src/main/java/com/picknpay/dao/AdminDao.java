
package com.picknpay.dao;

import com.picknpay.model.Admin;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class AdminDao{

	 @Autowired
	    private SessionFactory sessionFactory;

	public Admin validate(String emailAddress, String password) {
		Session sess=sessionFactory.getCurrentSession();
		String hql="FROM Admin u where u.emailAddress=:emailAddress and u.password=:password";
		Query query = sess.createQuery(hql);
		query.setParameter("emailAddress",emailAddress);
		query.setParameter("password",password);
		List results = query.list();
		Admin ad=null;
		
		if(results.size()>0){
			ad=(Admin) results.get(0);
			return ad;
		}else{
			return ad;
		}
		
	}

	
	
}
