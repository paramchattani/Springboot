package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		Instructor first=new Instructor("Param", "Chattani", "paramchattani") ;
		
		InstructorDetail ind=new InstructorDetail("abc.com","coder");
		
		first.setInstructorDetail(ind);
		
		session.beginTransaction();
		//this will also save the details object as it is cascaded 
		session.save(first);
		session.getTransaction().commit();
		System.out.print("Done");
	}
	finally {
		factory.close();
	}
	
	}

}
