package com.rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rakesh.bean.RegistrationBean;
import com.rakesh.service.RegisterService;


@Controller
public class RegistrationController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value= {"index.html","/"},method=RequestMethod.GET)
	public String getIndexPage()
	{
		return "index";
	}
	
	@RequestMapping(value="register.html",method=RequestMethod.GET)
	public String getHomePage()
	{
		return "register";
	}
	
	@RequestMapping(value="register.html",method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute RegistrationBean bean) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(bean);
		registerService.addUser(bean);
		
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
