package DAO;

import java.util.List;

import entities.Matiere;

public interface IEtudiantDAO  {
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
