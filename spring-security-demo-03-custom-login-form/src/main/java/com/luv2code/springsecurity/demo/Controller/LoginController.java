package com.luv2code.springsecurity.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showForm() {
		return "plain-login";
	}
	
	//add request mapping for access denied  
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		return "access-denied";
	}
	
}
