package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import entities.Colleges;
import entities.Departement;
import entities.Enseignant;
import entities.Matiere;
import entities.Noter;

public class DepartementDAO implements IGestionCollegeCRUD<Departement>,IDepartementDAO{

	
	
	
	private Session session; 
	
	
	
	public DepartementDAO() {
		
		session=Connexion.getInstance().getSession();
		
	}

	@Override
	public void ajouter(Departement t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
//		session.close();
		
	}

	@Override
	public void modifier(Departement t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
//		session.close();
		
	}

	@Override
	public void supprimer(Departement t) {

		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
//		session.close();
		
	}

	@Override
	public List<Departement> afficher() {
		
		return session.createQuery("from Departement").list();
	}

	@Override
	public Departement getById(int id) {
	
		return (Departement) session.get(Departement.class, id);
	}

	
}
