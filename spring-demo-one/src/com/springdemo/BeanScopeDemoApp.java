package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the sptring th eocfig fil e
	//	retrieve bean 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
Coach trackCoach=context.getBean("secondCoach",Coach.class);
Coach coach=context.getBean("secondCoach",Coach.class);
	
	boolean result=(trackCoach==coach);
	System.out.println("Pointing to same obejcts");
	}

}
