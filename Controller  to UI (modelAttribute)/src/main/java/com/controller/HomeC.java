package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.model.Student;

@Controller
public class HomeC {
	
	
	@RequestMapping("/")
	public String logindata()
	{
		return "login";
	}
	
	@RequestMapping("/regg")
	public String data1()
	{
		
		return "Register";
	}
	
	@RequestMapping("/da")
	public String data2(@ModelAttribute Student s,Model m)
	{
		System.out.println(s);
		m.addAttribute("mm", s);
		return "success";
		
	}
}
