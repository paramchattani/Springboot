package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyFortune());		
		//

	}

}
