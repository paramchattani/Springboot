package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		Student tempStudent=new Student("Param","Chattani","abc@gmail.com");
		session.beginTransaction();
		session.save(tempStudent);
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		factory.close();
	}
	
	}

}
