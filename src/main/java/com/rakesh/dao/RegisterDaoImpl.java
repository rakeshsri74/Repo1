package com.rakesh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.bean.RegistrationBean;

@Repository("registerDAO")
@Transactional(propagation= Propagation.REQUIRED)
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String addUser(RegistrationBean registrationBean) {
		Session session  = sessionFactory.getCurrentSession();
		session.saveOrUpdate(registrationBean);
		return "success";
	}

}
