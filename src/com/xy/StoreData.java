package com.xy;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData
{
	public static void main(String[] args)
	{
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory=configuration.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		Employee e1= new Employee();
		e1.setId(100);
		e1.setFirstName("m");
		e1.setLastName("s");
		
		session.persist(e1);
		
		transaction.commit();
		session.close();
		System.out.println("successfully save");
	}
}
