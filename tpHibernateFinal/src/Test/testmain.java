package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Colleges;
import entities.Departement;

public class testmain {

public static SessionFactory factory;
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Colleges c=new Colleges("ddd");
		Departement d=new Departement("fff");
//        session.persist(c);
//        session.persist(d);
//        
        Query q=session.createQuery(" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere");
        System.out.println(q.getQueryString());
        t.commit();
	}

}
