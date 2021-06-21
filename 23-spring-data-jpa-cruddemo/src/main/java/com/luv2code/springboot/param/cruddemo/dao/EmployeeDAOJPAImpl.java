package com.luv2code.springboot.param.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.param.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	//define entitymanager as session manager  
	
	@Autowired
	private EntityManager entityManager;
	//set up constructor injection 
	@Override
	@Transactional
public List<Employee> findAll() {
		Query theQuery=entityManager.createQuery("from Employee");
		//return null;
		List<Employee> employees=theQuery.getResultList();
		return employees;
	}
	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		Employee theEmployee=entityManager.find(Employee.class,theId);	
		return theEmployee;
	}
	@Override
	@Transactional
	public void save(Employee theEmployee) {
		
		//if id is 0 then we insert else we update as id starts with 1 
		Employee e=entityManager.merge(theEmployee);
		theEmployee.setId(e.getId());
		// TODO Auto-generated method stub
		
	}
	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

Query theQuery=entityManager.createQuery("delete from Employee where id=:employeeId");
theQuery.setParameter("employeeId", theId);
theQuery.executeUpdate();

	}

}
