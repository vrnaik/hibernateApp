package com.viresor.hibernetApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author vikas
 *
 */
public class HibernetLogic {

	public HibernetLogic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addAnnotatedClass(Employee.class);
		config.configure("hibernate.cfg.xml");
//		config.configure();

//		new SchemaExport().create();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Employee emp = new Employee();
		emp.setId(103);
		emp.setName("dsfs");
		emp.setAge(27);

		try {
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		} catch (HibernateException exception) {
			System.out.println("Problem creating session factory");
			exception.printStackTrace();
		}

	}

}
