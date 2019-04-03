package metier;

import java.util.List;

import DAO.CollegeDAO;
import DAO.MatiereDAO;
import entities.Colleges;
import entities.Matiere;

public class MatiereMetier implements IGestionCollegeMetier<Matiere> {

	private MatiereDAO dao;
	
	
	
	
	public MatiereMetier() {
		dao=new MatiereDAO();
	}

	@Override
	public void ajouter(Matiere t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Matiere t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Matiere t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Matiere> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Matiere getById(int id) {
		
		return dao.getById(id);
	}

	
}
