package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Footballer;

public class CreerFootballer {

public static SessionFactory factory;
	
	public static void main(String[] args) {
     Configuration configuration = new Configuration();
 	    configuration.configure();
 	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
 	            configuration.getProperties()). buildServiceRegistry();
 	    factory = configuration.buildSessionFactory(serviceRegistry);

 	    Session session=factory.openSession();
 	    Transaction t=session.beginTransaction();
 	    
 	    
 	   Footballer f1=new Footballer("f1", "PSG");
       Footballer f2=new Footballer("f2", "Marseille");
       session.persist(f1);
       session.persist(f2);
       t.commit();

	}

}
