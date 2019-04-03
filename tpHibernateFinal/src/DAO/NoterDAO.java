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

import entities.Noter;

public class NoterDAO implements IGestionCollegeCRUD<Noter>,INoterDAO {

	
	private Session session; 
	
	
	
	public NoterDAO() {
		session = Connexion.getInstance().getSession();
	}

	@Override
	public void ajouter(Noter t) {
	
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
	
		
	}

	@Override
	public void modifier(Noter t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
	
		
	}

	@Override
	public void supprimer(Noter t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
		
		
		
	}

	@Override
	public List<Noter> afficher() {
		
		return (List<Noter>) session.createQuery("from Noter");
	}

	@Override
	public Noter getById(int id) {
		
		return (Noter) session.get(Noter.class, id);
	}

	@Override
	public double getMoyenneParMatiere(int idMatiere) {
//		Query q = session.createQuery(" select n from Noter n where n.matiere.idMatiere =:id ").setParameter("id",
//				idMatiere);
//		float sommeNote = 0;
//		int nbEtudiants = 0;
//
//		for (Noter n : (List<Noter>) q.list()) {
//
//			if (n.getMatiere().getIdMatiere() == idMatiere) {
//
//				sommeNote += n.getNote();
//				nbEtudiants++;
//			}
//
//		}
//
//		float moyenne = sommeNote / nbEtudiants;
		
	Query q=session.createQuery(" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere").setParameter("id", idMatiere);
				return (double) q.list().get(0);
		// return moyenne;
	}

}
