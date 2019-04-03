package metier;

import java.util.List;

import DAO.CollegeDAO;
import entities.Colleges;

public class CollegeMetier implements IGestionCollegeMetier<Colleges> {

	private CollegeDAO dao;
	
	
	
	
	public CollegeMetier() {
		dao=new CollegeDAO();
	}

	@Override
	public void ajouter(Colleges t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Colleges t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Colleges t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Colleges> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Colleges getById(int id) {
		
		return dao.getById(id);
	}

	
}
