package metier;

import java.util.List;

import DAO.CollegeDAO;
import DAO.EnseignantDAO;
import entities.Colleges;
import entities.Enseignant;

public class EnseignantMetier implements IGestionCollegeMetier<Enseignant> {

	private EnseignantDAO dao;
	
	
	
	
	public EnseignantMetier() {
		dao=new EnseignantDAO();
	}

	@Override
	public void ajouter(Enseignant t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Enseignant t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Enseignant t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Enseignant> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Enseignant getById(int id) {
		
		return dao.getById(id);
	}

	
}
