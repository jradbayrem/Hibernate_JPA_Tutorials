package metier;

import java.util.List;

import DAO.CollegeDAO;
import DAO.SalleDAO;
import entities.Colleges;
import entities.Salle;

public class SalleMetier implements IGestionCollegeMetier<Salle> {

	private SalleDAO dao;
	
	
	
	
	public SalleMetier() {
		dao=new SalleDAO();
	}

	@Override
	public void ajouter(Salle t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Salle t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Salle t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Salle> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Salle getById(int id) {
		
		return dao.getById(id);
	}

	
}
