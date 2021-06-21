package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//load the spring config or applicationContext file 
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//retrieve the bean from the container
Coach theCoach=context.getBean("coach",Coach.class);		


		//call methods on the bea
System.out.println(theCoach.getMotivation());
		
	}

}

