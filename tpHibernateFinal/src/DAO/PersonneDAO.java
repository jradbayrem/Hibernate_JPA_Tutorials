package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import DTO.FicheSemantique;
import entities.Personne;

public class PersonneDAO implements IPersonneDAO,IGestionCollegeCRUD<Personne> {
	
	private Session session; 
	
	

	public PersonneDAO() {
		session = Connexion.getInstance().getSession();
	}



	@Override
	public void ajouter(Personne t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
		
	}



	@Override
	public void modifier(Personne t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
		
	}



	@Override
	public void supprimer(Personne t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
		
	}



	@Override
	public List<Personne> afficher() {
		
		return (List<Personne>) session.createQuery("from Personne").list();
	}



	@Override
	public Personne getById(int id) {
		
		return (Personne) session.get(Personne.class, id);
	}





}
