 package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class FetchJoinDemo {

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
		
		Query<Instructor> query=session.createQuery("select i from Instructor i "
													+ "JOIN FETCH i.courses "//JOINIG and FETCHING OTHER TABLES 
													+ "where i.id=:theInstructorId",
				Instructor.class);
		//we are creating reference of instructor entity using 'i' we are joining it with courses to specific instructor and we then define which instructor we are talking bout using i.id  
		query.setParameter("theInstructorId",theId);
		
		//execute the query and get instructor 
		
		Instructor tempInstructor=query.getSingleResult();//Load instructor and courses all at once 
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
