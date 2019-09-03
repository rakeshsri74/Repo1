package com.rakesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.bean.LoginBean;
import com.rakesh.bean.RegistrationBean;
import com.rakesh.dao.RegisterDao;

@Service("registerService")
@Transactional(propagation = Propagation.REQUIRED)
@EnableTransactionManagement
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterDao registerDAO;
	
	@Autowired
	LoginService loginService;
	
	@Override
	public String addUser(RegistrationBean registrationBean) {
		registerDAO.addUser(registrationBean);
		LoginBean loginBean = new LoginBean();
		loginBean.setPassword(registrationBean.getPassword());
		loginBean.setUserId(registrationBean.getEmailId());
		loginBean.setUserStatus("0");
		loginBean.setUserType("u");
		loginService.addLogin(loginBean);
		
		return "Success";
	}
}
