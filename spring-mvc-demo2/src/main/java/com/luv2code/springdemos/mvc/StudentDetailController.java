package com.luv2code.springdemos.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/studentdetail/")
public class StudentDetailController {

@RequestMapping("showform")
public String showForm() {
	return "st";
}
@RequestMapping("/processForm" )
public String showDetails(@RequestParam("name")String name,@RequestParam("age")String age,Model m)
{
m.addAttribute("name", name);
m.addAttribute("age",age);
return "showDetails";
}
}
