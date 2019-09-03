package com.rakesh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.bean.LoginBean;

@Repository("loginDAO")
@Transactional(propagation= Propagation.REQUIRED)
public class LoginDaoImpl implements LoginDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String addLogin(LoginBean loginBean) {
		
		Session session  = sessionFactory.getCurrentSession();
		session.saveOrUpdate(loginBean);
		return "success";
		
	}
	
	public LoginBean getLoginBean(LoginBean bean)
	{
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(LoginBean.class, bean.getUserId());
		
	}

}
