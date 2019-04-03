package metier;

import java.util.ArrayList;
import java.util.List;

import DAO.CollegeDAO;
import DAO.DepartementDAO;
import DAO.NoterDAO;
import entities.Colleges;
import entities.Departement;
import entities.Enseignant;

public class DepartementMetier implements IGestionCollegeMetier<Departement>,IDepartementMetier {

	private DepartementDAO dao;
	
	private NoterDAO ndao;
	
	
	public DepartementMetier() {
		dao=new DepartementDAO();
		ndao=new NoterDAO();
	}

	@Override
	public void ajouter(Departement t) {
		dao.ajouter(t);
	}

	@Override
	public void modifier(Departement t) {
		dao.modifier(t);
		
	}

	@Override
	public void supprimer(Departement t) {
		dao.supprimer(t);
		
	}

	@Override
	public List<Departement> afficher() {
		
		return dao.afficher();
	}

	@Override
	public Departement getById(int id) {
		
		return dao.getById(id);
	}

	@Override
	public double getMoyenneParDepartement(int idDepartement) {
		
		Departement dep =dao.getById(idDepartement);
		
		
		List<Integer> idMatieres=new ArrayList<>();
		double sommeMoyenne=0;
		
		for(Enseignant e : dep.getEnseignants()) {
			
			if(e.getMatiere().getIdMatiere()!=0) {
			idMatieres.add(e.getMatiere().getIdMatiere());
			sommeMoyenne+=ndao.getMoyenneParMatiere(e.getMatiere().getIdMatiere());
			}
		}
		
		
		
		double moyenneDep=sommeMoyenne/idMatieres.size();
		System.out.println("somme final "+sommeMoyenne+" nbfinal "+idMatieres.size());
		
		return moyenneDep;
	}


	
}
