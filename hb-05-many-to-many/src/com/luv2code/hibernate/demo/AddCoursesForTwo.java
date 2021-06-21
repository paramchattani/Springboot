package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class AddCoursesForTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Review.class).addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
	
		session.beginTransaction();
		//create course 
		int id=2;
		Student temp=session.get(Student.class,id);
		Course tempCourse1=new Course("Sudoku ");
		Course tempCourse2=new Course("Chess");
		Course tempCourse3=new Course("PinBalls");
		tempCourse1.addStudent(temp);
		tempCourse2.addStudent(temp);
		
		session.save(tempCourse1);
		session.save(tempCourse2);
		System.out.print("Done");
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
