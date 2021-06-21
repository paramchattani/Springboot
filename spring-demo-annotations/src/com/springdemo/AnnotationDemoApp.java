package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from spring container
		Coach c=context.getBean("tennisCoach",Coach.class);
		// call methods on the bean 
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//close the context
		context.close();
	} 

}


