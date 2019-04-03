package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Matiere;

public class MatiereDAO implements IGestionCollegeCRUD<Matiere> , IMatiereDAO {

	
	
	private Session session; 
	
	
	public MatiereDAO() {
		session = Connexion.getInstance().getSession();
	}

	@Override
	public void ajouter(Matiere t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
		
		
	}

	@Override
	public void modifier(Matiere t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
		
		
	}

	@Override
	public void supprimer(Matiere t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
		
		
	}

	@Override
	public List<Matiere> afficher() {
		
		return session.createQuery("from Matiere").list();
	}

	@Override
	public Matiere getById(int id) {
		
		return (Matiere) session.get(Matiere.class, id);
	}

}
