package metier;

import java.util.List;

import DAO.CollegeDAO;
import DAO.NoterDAO;
import entities.Colleges;
import entities.Noter;

public class NoterMetier implements IGestionCollegeMetier<Noter>,INoterMetier {

	private NoterDAO dao;
	
	
	
	
	public NoterMetier() {
		dao=new NoterDAO();
	}

	@Override
	public void ajouter(Noter t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Noter t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Noter t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Noter> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Noter getById(int id) {
		
		return dao.getById(id);
	}

	@Override
	public double getMoyenneParMatiere(int idMatiere) {
		
		return dao.getMoyenneParMatiere(idMatiere);
	}

	
}
