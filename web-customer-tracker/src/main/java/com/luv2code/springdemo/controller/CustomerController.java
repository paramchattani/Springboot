package com.luv2code.springdemo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	///inject SErivce in controoler
	@Autowired
	private CustomerService customerService;
	
@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel)
{
	Customer c=new Customer();
	theModel.addAttribute("customer",c);
	return "customer-form";
	}
	
@GetMapping("/list")
public String listCustomers(Model theModel)
{
	//get customers from dao 
	
	//add those customers to spring mvc model 
	
	List<Customer> theCustomers=customerService.getCustomers();
	theModel.addAttribute("customers",theCustomers);
	return "list-customers";
	}

@PostMapping("/saveCustomer")
public String saveCustomer(@ModelAttribute("customer")Customer theCustomer)
{
//save the customer using service 
	customerService.saveCustomer(theCustomer);
	return "redirect:/customer/list";
}

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("customerId")int theId,Model theModel) {
	
	//get particular customer from database 
	Customer theCustomer=customerService.getCustomer(theId);
	//set customer as a model attribute to prepopulate the form 
	theModel.addAttribute("customer",theCustomer);
	//send the info o fiorm 
	return "customer-form";

}

@GetMapping("/delete")
public String deleteCustomer(@RequestParam("customerId")int theId)
{
	customerService.deleteCustomer(theId);
	System.out.println("Dleted");
	return "redirect:/customer/list";
	}
}


//----> customer/list--->controller--->list-customers(view)---->browser 


