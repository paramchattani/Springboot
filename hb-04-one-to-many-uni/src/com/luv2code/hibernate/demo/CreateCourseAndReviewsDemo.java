package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Review.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		session.beginTransaction();
		//create course 
		Course tempCourse=new Course("PAckman");
		
		//add reviews
		tempCourse.addReview(new Review("Great Course loved it "));
		
		tempCourse.addReview(new Review("Great Voice loved it "));
		
		tempCourse.addReview(new Review("Great Content loved it "));
		session.save(tempCourse);
		//save course + reviews as cascade.ALL is there  
		
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
