package com.viresor.hibernetApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author vikas
 *
 */
public class InheritanceTableLogic {

	public InheritanceTableLogic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Module.class);
		config.addAnnotatedClass(Task.class);
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Project project = new Project();
		Module module = new Module();
		Task task = new Task();
		
		project.setProjectId(1);
		project.setProjectName("AWS");
		
		module.setProjectId(02);
		module.setProjectName("Spring lession");
		module.setModuleName("AOP");
		
		task.setProjectId(03);
		task.setProjectName("java Lession");
		task.setModuleName("collection");
		task.setTaskName("ArrayList");
		
		try {
			session.beginTransaction();
			session.save(project);
			session.save(module);
			session.save(task);
			session.getTransaction().commit();
			
		}catch(HibernateException e) {
			
			System.out.println(e);
			
		}

		session.close();
		factory.close();
	}

}
