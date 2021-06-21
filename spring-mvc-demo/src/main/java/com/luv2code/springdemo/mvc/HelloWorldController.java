package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
@RequestMapping("/showForm")
public String showForm()
{
	return "hello-world-form";
}

@RequestMapping("/processForm")
public String processForm()
{
	return "helloworld";
	
	}
@RequestMapping("/processFormTwo")
public String letsShoutDude(HttpServletRequest request,Model model)
{
	String theName=request.getParameter("name");
	theName=theName.toUpperCase();
	String result="Yo!" + theName;
	//read request parameter from html form
	model.addAttribute("message",result);
	//convert data to all caps
	//create message 
	//add messga to model 
	
return "helloworld";	
}
@RequestMapping("/processFormThree")
public String processFormVersionThree(@RequestParam("name")String theName,Model model)
{
	
	theName=theName.toUpperCase();
	String result="Yo ma lo !" + theName;
	//read request parameter from html form
	model.addAttribute("message",result);
	//convert data to all caps
	//create message 
	//add messga to model 
	
return "helloworld";	
}
}
