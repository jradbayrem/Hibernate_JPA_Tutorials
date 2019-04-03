package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ListerPlayer {

public static SessionFactory factory;
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();

		System.out.println(session.createQuery("from Player p").list());
		System.out.println(session.createQuery("from Cricketer c").list());
		System.out.println(session.createQuery("from Footballer f").list());

	}

}
