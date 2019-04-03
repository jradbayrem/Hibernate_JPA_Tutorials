package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Colleges;

public class CollegeDAO implements IGestionCollegeCRUD<Colleges>,ICollegeDAO{

	
	
	private Session session; 
	
	
	 
	
	public CollegeDAO() {
		
	 
	 session = Connexion.getInstance().getSession();

	}

	@Override
	public void ajouter(Colleges t) {

		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();

		
	}

	@Override
	public void modifier(Colleges t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();

		
	}

	@Override
	public void supprimer(Colleges t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();

	}

	@Override
	public List<Colleges> afficher() {
		
		return session.createQuery("from Colleges").list();
	}

	@Override
	public Colleges getById(int id) {
	
		return (Colleges) session.get(Colleges.class, id);
	}

}
