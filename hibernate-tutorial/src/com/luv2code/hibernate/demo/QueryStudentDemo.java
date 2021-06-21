package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		session.beginTransaction();
		List<Student> theStudents=session.createQuery("from Student").list();
		
		for(Student s:theStudents)
		{
			System.out.println(s);
		}
		
	
		session.getTransaction().commit();
		
		System.out.print("Done");
	}
	finally {
		factory.close();
	}
	
	}

}
