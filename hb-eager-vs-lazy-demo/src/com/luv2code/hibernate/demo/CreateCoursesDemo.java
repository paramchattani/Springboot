package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CreateCoursesDemo {

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
		
		//crate some courses 

		Course tempCourse1=new Course("Mettalic guitar");
		
		Course tempCourse2=new Course("The pinball master");
		
		//add courses to instructor

		tempInstructor.add(tempCourse1);
		tempInstructor.add(tempCourse2);
		// save the courses 
		session.save(tempCourse1);
		session.save(tempCourse2);
		
		session.save(tempInstructor);
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
