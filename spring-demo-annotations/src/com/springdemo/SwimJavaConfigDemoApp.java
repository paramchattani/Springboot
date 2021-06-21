package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get bean from spring container
		SwimCoach c=context.getBean("swimCoach",SwimCoach.class);
		// call methods on the bean 
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		System.out.println(c.getEmail());
		System.out.println(c.getTeam());
		//close the context
		context.close();
	} 

}


