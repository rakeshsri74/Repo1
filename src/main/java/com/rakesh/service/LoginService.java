package com.rakesh.service;

import com.rakesh.bean.LoginBean;

public interface LoginService {
	
	public String addLogin(LoginBean loginBean) ;
	
	public LoginBean validateUser(LoginBean bean);

}
