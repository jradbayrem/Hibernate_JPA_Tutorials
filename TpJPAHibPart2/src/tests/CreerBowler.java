package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Bowler;
import entities.Footballer;

public class CreerBowler {

public static SessionFactory factory;
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Bowler b1 = new Bowler("b1", 58.6f, 59.3f);
		Bowler b2 = new Bowler("b2", 40.6f, 49.3f);
		session.persist(b1);
		session.persist(b2);

		t.commit();
	}

}
