package Test;

import entities.Departement;
import entities.Enseignant;
import metier.DepartementMetier;
import metier.EnseignantMetier;

public class DepartementTest {

	public static void main(String[] args) {
		DepartementMetier depmetier=new DepartementMetier();
		EnseignantMetier ensmetier=new EnseignantMetier();
	System.out.println(depmetier.getMoyenneParDepartement(1));
		
//		System.out.println(depmetier.afficher());
//	
//		Departement dep=depmetier.getById(1);
//		Enseignant ens=ensmetier.getById(2);
//		dep.setResponsable(ens);
//		depmetier.modifier(dep);
//		
//		System.out.println(dep);
//		System.out.println(dep.getEnseignants());
//		
//		

	}

}
