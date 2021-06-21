package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloparam")
public class ParamDetailController {

	@RequestMapping("/showform")
	public String show(Model m)
	{
		ParamDetail p=new ParamDetail();
		m.addAttribute("student",p);
		return "seeForm";
	}
	@RequestMapping("/processForm")
	public String showDetails(@ModelAttribute("student")ParamDetail p)
	{
	return "confirmation page";	
	}
}
