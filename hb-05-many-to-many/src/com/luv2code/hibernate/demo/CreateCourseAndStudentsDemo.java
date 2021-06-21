package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Review.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		session.beginTransaction();
		//create course 
		Course tempCourse=new Course("PAckman");
		session.save(tempCourse);
		
		Student temps1=new Student("A","B","AB@.com");
		Student temps2=new Student("AB","BC","ABCD@.com");
		Student temps3=new Student("ABC","BCD","ABCDE@.com");
		tempCourse.addStudent(temps1);
		//tempCourse.addStudent(temps);
		tempCourse.addStudent(temps1);
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
