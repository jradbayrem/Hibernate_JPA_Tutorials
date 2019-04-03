package Part2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Adresse;
import entities.Employer;
import entities.Entreprise;
import entities.Equipe;
import entities.Projet;
import entities.Todo;

public class test {

public static SessionFactory factory;
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

        Employer employer1=new Employer("employer1","employer1",25);
		Employer employer2 = new Employer("employer2", "employer2", 28);
		Employer employer3 = new Employer("employer3", "employer3", 29);
		Employer employer4 = new Employer("employer4", "employer4", 30);
		Employer employer5 = new Employer("employer5", "employer5", 35);
		Employer employer6 = new Employer("employer6", "employer6", 36);
		
		
		List<Projet> projets=new ArrayList<Projet>();
		List<Projet> projets2=new ArrayList<Projet>();
		
		Projet proj1=new Projet("proj1");
		Projet proj2=new Projet("proj2");
		
		Projet proj3=new Projet("proj3");
		Projet proj4=new Projet("proj4");
		
		session.persist(proj1);
		session.persist(proj2);
		session.persist(proj3);
		session.persist(proj4);
		
		projets.add(proj1);
		projets.add(proj2);
		
		projets2.add(proj3);
		projets2.add(proj4);
		
		employer1.setProjets(projets);
		employer2.setProjets(projets);
		
		employer4.setProjets(projets2);
		employer5.setProjets(projets2);
		
		
		Adresse a=new Adresse("rue d'université","Lyon",69008);		
		Adresse a1=new Adresse("rue x","Lyon",69008);
		Adresse a2=new Adresse("commerce","Nante",44200);
		Adresse a3=new Adresse("rue y","Nante",44200);
		
		
		Equipe eq1=new Equipe("JAVA");
		Equipe eq2=new Equipe(".NET");
		
		session.persist(eq1);
		session.persist(eq2);
		
		employer1.setAdresse(a);
		employer1.setEquipe(eq1);
		
		employer2.setAdresse(a1);
		employer2.setEquipe(eq1);
		
		employer4.setAdresse(a2);
		employer4.setEquipe(eq2);
		
		employer5.setAdresse(a3);
		employer5.setEquipe(eq2);
		
		Entreprise e = new Entreprise("Adaming");
		Entreprise e1 = new Entreprise("Sopra");
//		
		create(session, e, employer1);
		create(session, e, employer2);
		create(session, e1, employer4);
		create(session, e1, employer5);
		
		list(session, 1);
		list(session, 2);
		
		t.commit();

	}
	
	private static void create(Session session, Entreprise e,Employer emp) {
		List<Entreprise> maliste=session.createQuery(" from Entreprise e").list();
		
		
		for (Entreprise entreprise : maliste) {
			if (e.getNom().equals(entreprise.getNom())) {

				e = entreprise;

			}
		}

		if (!e.getEmployers().contains(emp)) {
			emp.setEntreprise(e);
			e.getEmployers().add(emp);
			session.merge(e);
			// session.save(emp);
		}
	}
    private static void list(Session session,int id) {
    Entreprise e=(Entreprise) session.get(Entreprise.class, id);
		System.out.println(e.getEmployers());
    }
    
    
}
