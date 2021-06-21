package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		
		session=factory.getCurrentSession();
		session.beginTransaction();
		session.createQuery("update Student set email='myabc@gmail.com'").executeUpdate();
		session.getTransaction().commit();
		
		
		System.out.print("Done");
	}
	finally {
		factory.close();
	}
	
	}

}
