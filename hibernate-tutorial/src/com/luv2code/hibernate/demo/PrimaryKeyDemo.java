package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		try
		{
			
			Student tempStudent1=new Student("Kajal","Chattani","abc@gmail.com");
			Student tempStudent2=new Student("Heena","Chattani","abc@gmail.com");
			Student tempStudent3=new Student("Durgadas","Chattani","abc@gmail.com");
			session.beginTransaction();
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			System.out.print("Done");
		}
		finally {
			sessionFactory.close();
		}
	}

}
