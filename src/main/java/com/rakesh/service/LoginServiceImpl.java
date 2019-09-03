package com.rakesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.bean.LoginBean;
import com.rakesh.dao.LoginDao;


@Service("loginService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDAO;
	@Override
	public String addLogin(LoginBean loginBean) {
		// TODO Auto-generated method stub
		loginDAO.addLogin(loginBean);
		
		
		return "success";
	}
	
	public LoginBean validateUser(LoginBean bean)
	{
		return loginDAO.getLoginBean(bean);
	}

}
