package metier;

import java.util.List;

import DAO.PersonneDAO;
import DTO.FicheSemantique;
import entities.Personne;

public class PersonneMetier implements IPersonneMetier,IGestionCollegeMetier<Personne> {
	
	
	private PersonneDAO pdao;
	
	
	

	public PersonneMetier() {
		pdao=new PersonneDAO();
		
	}




	@Override
	public FicheSemantique afficherFicheSemantisue(int idPersonne) {
		
		
			Personne p=pdao.getById(idPersonne);
			FicheSemantique fs=new FicheSemantique();
			fs.setPrenom(p.getPrenom());
			fs.setMail(p.getMail());
			fs.setTel(p.getTel());
			return fs;
		
	}




	@Override
	public void ajouter(Personne t) {
		pdao.ajouter(t);
		
	}




	@Override
	public void modifier(Personne t) {
		pdao.modifier(t);
		
	}




	@Override
	public void supprimer(Personne t) {
		pdao.supprimer(t);
		
	}




	@Override
	public List<Personne> afficher() {
		
		return pdao.afficher();
	}




	@Override
	public Personne getById(int id) {
		
		return pdao.getById(id);
	}

}
