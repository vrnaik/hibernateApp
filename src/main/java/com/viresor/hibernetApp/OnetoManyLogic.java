package com.viresor.hibernetApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoManyLogic {

	public OnetoManyLogic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(Order.class);
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		Customer custom = new Customer();
		custom.setCustomerName("vikas naik");

		Order ord1 = new Order();
		Order ord2 = new Order();

		ord1.setOrderDate("todya");
		ord2.setOrderDate("tomorrow");

		ord1.setCust(custom);
		ord2.setCust(custom);

		custom.getOrders().add(ord1);
		custom.getOrders().add(ord2);

		try {
			session.beginTransaction();
			session.save(custom);
			session.save(ord1);
			session.save(ord2);

			session.getTransaction().commit();
		} catch (HibernateException e) {

			System.out.println(e);

		}

		session.close();
		factory.close();
	}

}
