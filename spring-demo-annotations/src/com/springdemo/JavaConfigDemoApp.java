package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get bean from spring container
		Coach c=context.getBean("tennisCoach",Coach.class);
		// call methods on the bean 
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//close the context
		context.close();
	} 

}


