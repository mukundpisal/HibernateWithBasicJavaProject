package com.prowing.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateApi {
	
	public static void main(String[] args) {
		System.out.println(" main method started ");
SessionFactory factory=	new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	System.out.println(factory);
	Session session=null;
	Transaction tx=null;
	try {

	 session = factory.openSession();
	
	 tx = session.beginTransaction();
	
	Car1 cr1 = new Car1("Thar", "Mahindra", 1600000);
	Car1 cr2 = new Car1("Discovery", "LandRover", 6000000);
	Car1 cr3 = new Car1("RangeRover", "LandRover", 16000000);
	Car1 cr4 = new Car1("Compass", "Jeep", 4000000);
	
	session.save(cr1);
	session.save(cr2);
	session.save(cr3);
	session.save(cr4);

	tx.commit();
		}
		catch(Exception e) {
			System.out.println(" Some exception occurred");
		e.printStackTrace();
		}
	System.out.println(" All object Stored successfully in Mysql database");
	}

}
