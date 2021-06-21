package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

	Session session =factory.getCurrentSession();
	try
	{
		
		session.beginTransaction();
		int theid=1;
		InstructorDetail temp=session.get(InstructorDetail.class, theid);
		//this will also save the details object as it is cascaded 
		//session.save(first);
		//temp.getInstr() will give instructor obj and hen e say we don not want to associate it with any instructor detial
		temp.getInstr().setInstructorDetail(null);
		session.delete(temp);
		session.getTransaction().commit();
		System.out.print("Done");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		session.close();
		factory.close();
	}
	
	}

}
