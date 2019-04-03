package Test;

import org.hibernate.Query;

import DAO.EtudiantDAO;
import DAO.NoterDAO;
import entities.Departement;
import entities.Enseignant;
import entities.Etudiant;
import metier.DepartementMetier;
import metier.EnseignantMetier;
import metier.EtudiantMetier;
import metier.PersonneMetier;

public class PersonneTest {

	public static void main(String[] args) {
		
    		

    PersonneMetier pmetier=new PersonneMetier(); 
    
//    System.out.println(pmetier.afficher());
//    
//    System.out.println(pmetier.getById(1));
    
  
    
    
    System.out.println(pmetier.afficherFicheSemantisue(5));
//     
    EtudiantMetier emetier=new EtudiantMetier();
    System.out.println(emetier.getMoyenneGenerale(6));
//		
    System.out.println(emetier.getMatieresSansNote(6));
    
//		System.out.println(emetier.afficher());
		
		
//		Etudiant e=emetier.getById(5);
//		e.setNom("etudiant1");
//		
//		emetier.modifier(e);
//		
//		System.out.println(e);
//    
    
    EnseignantMetier ensmetier=new EnseignantMetier();
//    System.out.println(ensmetier.afficher());
//    Enseignant ens4=ensmetier.getById(4);
//    Enseignant ens3=ensmetier.getById(3);
//    ens3.setNom("enseignant 3");
//    
//    DepartementMetier depmetier=new DepartementMetier();
//    Departement dep=depmetier.getById(2);
//    ens3.setDepartement(dep);
//    ens4.setDepartement(dep);
//    ensmetier.modifier(ens3);
//    ensmetier.modifier(ens4);
//    
//    System.out.println(ens3);
//    System.out.println(ens4);
//    
    

	}

}
