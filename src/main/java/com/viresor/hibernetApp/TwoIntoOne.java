package com.viresor.hibernetApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author vikas
 *
 */
public class TwoIntoOne {

	public TwoIntoOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(People.class);
		config.addAnnotatedClass(Address.class);
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Address ad = new Address();
		
		ad.setAddress("street Avenue");
		ad.setCity("new york");
		ad.setState("NewYork");
		ad.setCountry("USA");
		
		People p = new People();
		p.setAddr(ad);
//		p.setId(100);
		p.setName("viki");
		p.setAge(27);
		p.setOccupation("militry");
		
		try {
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			
		}catch(HibernateException e) {
			
			System.out.println(e);
			
		}
		session.close();
		factory.close();
	
		

	}

}
