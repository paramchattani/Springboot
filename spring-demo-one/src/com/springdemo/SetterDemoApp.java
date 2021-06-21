package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
			// load the spring config file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach=context.getBean("thirdCoach",CricketCoach.class);
		//call methods on bean
		//setter method called behind thescenes   
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();
	}

}
