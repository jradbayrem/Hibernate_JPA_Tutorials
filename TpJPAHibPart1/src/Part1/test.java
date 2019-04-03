package Part1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Todo;

/**
 * Hello world!
 *
 */
public class test 
{
public static SessionFactory factory;
	
	public static void main(String[] args) {
     Configuration configuration = new Configuration();
 	    configuration.configure();
 	    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
 	            configuration.getProperties()). buildServiceRegistry();
 	    factory = configuration.buildSessionFactory(serviceRegistry);

 	    Session session=factory.openSession();
 	    Transaction t=session.beginTransaction();
 	    

		
		create(session,"premier test","hibernate jpa");
		
		list(session);

		t.commit();
    }
    private static void create(Session session, String summary, String description) {
		Todo todo = new Todo();
		todo.setSummary(summary);
		todo.setDescription(description);
		session.persist(todo);
	}
    private static void list(Session session) {
    	List<Todo> maliste=session.createQuery("select t from Todo t").list();
		System.out.println(maliste);
    }
}
