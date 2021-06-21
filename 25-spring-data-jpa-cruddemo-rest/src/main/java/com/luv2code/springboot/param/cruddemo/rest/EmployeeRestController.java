package com.luv2code.springboot.param.cruddemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.luv2code.springboot.param.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.param.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

@Autowired
private EmployeeDAO employeeDAO;

@GetMapping("/employees")
public List<Employee> findsAll()
{
	return employeeDAO.findAll();
}

@GetMapping("/employees/{id}")
public Employee findById(@PathVariable int id)
{
	return employeeDAO.findById(id);
}

@PostMapping("/employees")
public void addEmployee(@RequestBody Employee theEmployee)
{
	theEmployee.setId(0);
	employeeDAO.save(theEmployee);
	
}
}
