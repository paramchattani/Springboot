package com.luv2code.springboot.param.cruddemo.dao;

import java.util.List;

import com.luv2code.springboot.param.cruddemo.entity.Employee;

public interface EmployeeDAO {
public List<Employee> findAll();
public Employee findById(int theId);
public void save(Employee theEmployee);
public void deleteById(int theId);
}
