package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		Student tempStudent=new Student("Laxmi","Chattani","abcd@gmail.com");
		session.beginTransaction();
		session.save(tempStudent);
		session.getTransaction().commit();
		//now get a new session and start transaction 
		session =factory.getCurrentSession();
		session.beginTransaction();
		
		//retrieve syudent based on the id : primary key 
		Student s=session.get(Student.class, tempStudent.getId());
		System.out.println(s.getId());
		session.getTransaction().commit();
		//commi9t transaction 
		
		System.out.print("Done");
	}
	finally {
		factory.close();
	}
	
	}

}
