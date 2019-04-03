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

import entities.Etudiant;
import entities.Matiere;
import entities.Noter;

public class EtudiantDAO implements IGestionCollegeCRUD<Etudiant> , IEtudiantDAO {

	
	
	private Session session; 
	
	public EtudiantDAO() {
		session = Connexion.getInstance().getSession();
	}

	@Override
	public void ajouter(Etudiant t) {
		
		Transaction transaction = session.beginTransaction();

		session.persist(t);

		transaction.commit();
	
		
		
	}

	@Override
	public void modifier(Etudiant t) {
		
		Transaction transaction = session.beginTransaction();

		session.update(t);

		transaction.commit();
		
		
		
	}

	@Override
	public void supprimer(Etudiant t) {
		
		Transaction transaction = session.beginTransaction();

		session.delete(t);

		transaction.commit();
		
	}

	@Override
	public List<Etudiant> afficher() {
		
		return session.createQuery("from Etudiant").list();
	}

	@Override
	public Etudiant getById(int id) {
		
		return (Etudiant) session.get(Etudiant.class, id);
	}

	@Override
	public double getMoyenneGenerale(int idEtudiant) {
		Query q=session.createQuery(" select avg(note) from Noter n where n.etudiant.idPersonne =:id group by n.etudiant.idPersonne").setParameter("id", idEtudiant) ;
		return (double) q.list().get(0);
	}

	@Override
	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		List<Noter> noters=session.createQuery(" from Noter n").list();
		List<Matiere> matiers=new ArrayList<>();
		for(Noter n : noters) {
			if(n.getEtudiant().getIdPersonne()==idEtudiant && n.getNote()==null) {
				
				matiers.add(n.getMatiere());
			}
			
			
			
		}
		
		return matiers;
	}

}
