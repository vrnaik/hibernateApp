package com.viresor.hibernetApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneLogic {

	public static void main(String... args) {

		Configuration config = new Configuration();
		config.addAnnotatedClass(Course.class);
		config.addAnnotatedClass(CourseDetail.class);
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Course c = new Course();
		CourseDetail cd = new CourseDetail();

//	c.setCourseId(01);
		c.setCourseName("javascript bootcamp");
		c.setCourseDuration(180);
//	c.setCourseDetail(cd);

		cd.setInstructor("Mr. Vikas Naik");
		cd.setFees(2000);
		cd.setCourse(c);

		try {
			session.beginTransaction();
			session.save(cd);
			session.getTransaction().commit();

		} catch (HibernateException e) {

			System.out.println(e);

		}

		session.close();
		factory.close();

	}

}
