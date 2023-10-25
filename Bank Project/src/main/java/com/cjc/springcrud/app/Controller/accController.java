package com.cjc.springcrud.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springcrud.app.model.CreateAccount;
import com.cjc.springcrud.app.servicei.Aservicei;

@Controller
public class accController {
	
	
	@Autowired
	Aservicei asi;
	
	@RequestMapping("/")
	public String adminn()
	{
		return "admin";
	}
	
	@RequestMapping("/admin")
	public String loginn()
	{
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String optionn(@RequestParam String username, @RequestParam String password)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
			return "option";
		}
		else
		{
			
			return "login";
		}
		
	}
	
	@RequestMapping("/appl")
	public String creataccc()
	{
		
		
		
		return "create";
		
		
	}

	@RequestMapping("/crr")
	public String savedd(@ModelAttribute CreateAccount c, Model m)
	{
		CreateAccount ca=asi.savedd(c);
		m.addAttribute("l", ca);
		return "final";
	
		
	}
	@RequestMapping("/logc")
	public String enty()
	{
		
		return "enter";
	}
	
	@RequestMapping("/enter")
	public String singda(@RequestParam int accountno,Model m)
	{
		CreateAccount ca=asi.singda(accountno);
		m.addAttribute("l", ca);
		return "details";
		
	}
	
	@RequestMapping("/delete")
	public String deleteacc(@RequestParam int accountno)
	{
		asi.deleteacc(accountno);
		
		return "successfuldelete";
		
	}
	
	@RequestMapping("/withd")
	public String open()
	{
		return "withdraw";
	}
	
	
	
	@RequestMapping("/with")
	public String withdrawal(@RequestParam int accountno,@RequestParam double ammount,Model m)
	{
		CreateAccount ca=asi.withdrawal(accountno,ammount);
		m.addAttribute("l", ca);
		return "withdrawalam";
	}
	
	
	
	@RequestMapping("/deposite")
	public String opendeposite()
	{
		return "deposite";
	}
	
	@RequestMapping("/depo")
	public String depositee(@RequestParam int accountno , @RequestParam double ammount , Model m)
	{
		CreateAccount ca=asi.depositee(accountno,ammount);
		m.addAttribute("d", ca);
		return "finaldepo";
	}
	
	
	
	@RequestMapping("/edit")
	public String editdata(@RequestParam int accountno,Model m)
	{
		CreateAccount ca=asi.editdata(accountno);
		m.addAttribute("c", ca);
		return "edit";
	}
	
	
	
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute CreateAccount c,Model m)
	{
	CreateAccount ca=asi.updatedata(c);
	m.addAttribute("l", ca);
		return "details";
	}
	
	
	@RequestMapping("/display")
	public String display(@RequestParam int accountno , Model m)
	{
		CreateAccount ca=asi.displaydata(accountno);
		m.addAttribute("l", ca);
		return "displays";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "enter";
	}

	@RequestMapping("/home1")
	public String home1()
	{
		return "enter";
	}
	@RequestMapping("/home2")
	public String home2()
	{
		return "enter";
	}
	@RequestMapping("/home3")
	public String home3()
	{
		return "enter";
	}
	
	
	
	
	
	

	
	

	
	
	
	

}
