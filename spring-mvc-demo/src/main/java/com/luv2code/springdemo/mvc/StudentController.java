package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		//create student object;
		Student theStudent=new Student();
		//add the sudent object as model attribytev ie add it to the model 
	theModel.addAttribute("student",theStudent);
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("student") Student theStudent)
	{
		//all ready all the details are availabe in the Student
		return "student-confirmation"; 
	}

}
