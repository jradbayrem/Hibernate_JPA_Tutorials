package Test;

import entities.Matiere;
import entities.Salle;
import metier.MatiereMetier;
import metier.SalleMetier;

public class MatiereSalleTest {
	
	
	
	public static void main(String[] args) {
		
		MatiereMetier matmetier=new MatiereMetier();
		SalleMetier smetier=new SalleMetier();
		
		Matiere m=matmetier.getById(4);
		Salle s1=smetier.getById(1);
		
		s1.setNbrPlace(31);
		
		m.setSalle(s1);
		smetier.modifier(s1);
		matmetier.modifier(m);
		
		System.out.println(m +" Salle : " + m.getSalle());
		
		System.out.println(matmetier.afficher());
		
		System.out.println(smetier.afficher());
		
	}

}
