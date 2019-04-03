package Test;

import entities.Colleges;
import metier.CollegeMetier;

public class CollegeTest {
	
	

	
	public static void main(String[] args) {
		
		CollegeMetier cmetier=new CollegeMetier();
		Colleges c=cmetier.getById(1);
		
		System.out.println(c.getDepartements());
		
		
		
		c.setSiteInternet("college.fr");
		
		System.out.println(cmetier.getById(1));
		
		Colleges c2=new Colleges("college2.com");
		
		cmetier.ajouter(c2);
		
		System.out.println(cmetier.afficher());
	}

}
