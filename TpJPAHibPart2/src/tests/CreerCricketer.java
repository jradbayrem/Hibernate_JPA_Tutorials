package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Cricketer;

public class CreerCricketer {

public static SessionFactory factory;
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Cricketer c1 = new Cricketer("c1", 58.2f);
		Cricketer c2 = new Cricketer("c2", 56.2f);

		session.persist(c1);
		session.persist(c2);
		t.commit();
	}

}
