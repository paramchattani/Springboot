package com.luv2code.springdemos.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SilllyController {
	@RequestMapping("/showForm")
	public String displayForm()
	{
		return "silly";
	}

}
