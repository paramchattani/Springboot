package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EagerLazyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		
		session.beginTransaction();
		//this will also save the details object as it is cascaded 
		
		//get the instrctor from db 
		
		int theId=1;
		Instructor tempInstructor=session.get(Instructor.class,theId);
		System.out.println(tempInstructor);
		System.out.println("Courses"+tempInstructor.getCourses());
		session.getTransaction().commit();
		System.out.println("Hey session si already closed");
	session.close();
System.out.println("Courses"+tempInstructor.getCourses());	//loaded from the memory 
		
		System.out.print("mycode: Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
