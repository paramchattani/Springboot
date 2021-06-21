package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class GetCourseAndReviewsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Review.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		session.beginTransaction();
		//get course  
		int ids=10;
		Course temp=session.get(Course.class,ids);
		System.out.println(temp);
		System.out.println(temp.getReviews());//Lazy fetch 
		//pritn the course 
		session.delete(temp);
		//pribt the course revies  
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
