package com.rakesh.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rakesh.bean.LoginBean;
import com.rakesh.service.LoginService;


@SessionAttributes
@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="login.html",method=RequestMethod.GET)
	
	public String getHomePage()
	{
		return "login";
	}
	
	@RequestMapping(value="login.html",method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute LoginBean bean, HttpSession httpSession)
	{
		ModelAndView modelAndView = new ModelAndView();
		LoginBean res = loginService.validateUser(bean);
		if(res!=null)
		{
			httpSession.setAttribute("obj", res);
			httpSession.setAttribute("userName", res.getUserId());
			modelAndView.setViewName("success");
		}
		else
		{
			modelAndView.setViewName("fail");
		}
		return modelAndView;
	}
	
	 
	
}
