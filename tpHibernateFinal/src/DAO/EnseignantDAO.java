package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import DTO.FicheSemantique;
import entities.Colleges;
import entities.Enseignant;

public class EnseignantDAO implements IGestionCollegeCRUD<Enseignant>,IEnseignantDAO{

	

	private Session session; 
	
	public EnseignantDAO() {
		session = Connexion.getInstance().getSession();
	}

	@Override
	public void ajouter(Enseignant t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
	
		
	}

	@Override
	public void modifier(Enseignant t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
		
		
	}

	@Override
	public void supprimer(Enseignant t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
	
		
	}

	@Override
	public List<Enseignant> afficher() {
		
		return session.createQuery("from Enseignant").list();
	}

	@Override
	public Enseignant getById(int id) {
		
		return (Enseignant) session.get(Enseignant.class, id);
	}

	
}
