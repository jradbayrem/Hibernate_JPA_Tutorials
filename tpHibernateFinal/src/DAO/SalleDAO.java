package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Salle;

public class SalleDAO implements IGestionCollegeCRUD<Salle> , ISalleDAO {

	
	
	private Session session; 
	
	
	public SalleDAO() {
		
		
		session = Connexion.getInstance().getSession();
	}

	@Override
	public void ajouter(Salle t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
		
		
		
	}

	@Override
	public void modifier(Salle t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
		
		
		
	}

	@Override
	public void supprimer(Salle t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
	
		
		
	}

	@Override
	public List<Salle> afficher() {
		
		return session.createQuery("from Salle").list();
	}

	@Override
	public Salle getById(int id) {
		
		return (Salle) session.get(Salle.class, id);
	}

}
