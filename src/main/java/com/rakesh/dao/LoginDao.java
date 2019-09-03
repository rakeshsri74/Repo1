package com.rakesh.dao;

import com.rakesh.bean.LoginBean;

public interface LoginDao {
	public String addLogin(LoginBean logBean);
	public LoginBean getLoginBean(LoginBean bean);
}
