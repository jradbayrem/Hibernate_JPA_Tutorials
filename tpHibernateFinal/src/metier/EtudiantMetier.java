package metier;

import java.util.List;

import DAO.CollegeDAO;
import DAO.EtudiantDAO;
import entities.Colleges;
import entities.Etudiant;
import entities.Matiere;

public class EtudiantMetier implements IGestionCollegeMetier<Etudiant>,IEtudiantMetier {

	private EtudiantDAO dao;
	
	
	
	
	public EtudiantMetier() {
		dao=new EtudiantDAO();
	}

	@Override
	public void ajouter(Etudiant t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Etudiant t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Etudiant t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Etudiant> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Etudiant getById(int id) {
		
		return dao.getById(id);
	}

	@Override
	public double getMoyenneGenerale(int idEtudiant) {
		
		return dao.getMoyenneGenerale(idEtudiant);
	}

	@Override
	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		
		return dao.getMatieresSansNote(idEtudiant);
	}

	
}
