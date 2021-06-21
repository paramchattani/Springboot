package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
	//read spring config java class 
		//get the bean from cintainer
		AccountDAO theDAO=context.getBean("accountDAO",AccountDAO.class);
		List<Account> theAccounts=theDAO.findAccounts();
	System.out.println(theAccounts);
		//call business method
		theDAO.addAccount();
		//close pring context
		context.close();
	}

}
