package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DeleteCourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		
		session.beginTransaction();
		 
		
		//get a course
		int theId=10;
		Course tempCourse=session.get(Course.class,theId);
		System.out.println("Deleting coure"+ tempCourse);
		
		session.delete(tempCourse);
		
		//delete course
		
		//commit
		
		//get the instrctor from db 
		
		//
		
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
