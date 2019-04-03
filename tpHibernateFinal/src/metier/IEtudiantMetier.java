package metier;

import java.util.List;

import entities.Matiere;

public interface IEtudiantMetier {
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
