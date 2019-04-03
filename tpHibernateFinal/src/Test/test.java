package Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import DAO.CollegeDAO;
import DAO.DepartementDAO;
import DAO.EnseignantDAO;
import entities.Colleges;
import entities.Departement;
import entities.Enseignant;
import entities.Etudiant;
import entities.Matiere;
import entities.Noter;
import entities.Salle;
import metier.CollegeMetier;
import metier.DepartementMetier;
import metier.EnseignantMetier;
import metier.EtudiantMetier;
import metier.MatiereMetier;
import metier.NoterMetier;
import metier.SalleMetier;

public class test {


	
	public static void main(String[] args) throws ParseException {
//     
//		College c2=new College("college2.fr");
//		CollegeMetier cdao=new CollegeMetier();
//		cdao.ajouter(c2);
		
		Colleges c2=new Colleges();
		c2.setSiteInternet("site1");
		CollegeMetier mcollege=new CollegeMetier();
		mcollege.ajouter(c2);
		EnseignantMetier emetier=new EnseignantMetier();
    	DepartementMetier dmetier=new DepartementMetier();
    	
    	

		
		Calendar dateprise1=Calendar.getInstance();
	    dateprise1.set(2017, 0, 1);

//dateprise1.set(Calendar.YEAR, 2017);
//dateprise1.set(Calendar.MONTH, 2);
//dateprise1.set(Calendar.DATE, 23);
	    dateprise1.set(Calendar.SECOND, 00);
	    
	    SimpleDateFormat df=new SimpleDateFormat("yyyy/M/dd");
		Calendar dateprise2=Calendar.getInstance();
		dateprise2.set(2018, 0, 5);
		
		String dprise1=df.format(dateprise1.getTime());
		Date dpriseDate=df.parse(dprise1);
		
		Calendar dateprise3=Calendar.getInstance();
		dateprise3.set(2016, 3, 25);
	    
	    Calendar dateprise4=Calendar.getInstance();
	    dateprise4.set(2015, 4, 11);
		
		
		
		Departement d1=new Departement("Informatique");
		d1.setCollege(c2);
		Departement d2=new Departement("Biologique");
		d2.setCollege(c2);
		Departement d3=new Departement("Technique");
		d3.setCollege(c2);
		
		 Salle s1=new Salle(28);
		    Salle s2=new Salle(30);
		    
		    SalleMetier smetier=new SalleMetier();
		    smetier.ajouter(s1);
		    smetier.ajouter(s2);
		    
		    Matiere m1=new Matiere("JAVA");
		    Matiere m2=new Matiere("SQL");
		    Matiere m3=new Matiere("français");
		    Matiere m4=new Matiere("Math");
		    
		    
		    
		    m1.setSalle(s1);
		    m2.setSalle(s1);
		    
		    m3.setSalle(s2);
		    m4.setSalle(s2);
		    
		    MatiereMetier matmetier=new MatiereMetier();
		    matmetier.ajouter(m1);
		    matmetier.ajouter(m2);
		    matmetier.ajouter(m3);
		    matmetier.ajouter(m4);
		    
		    Enseignant e1=new Enseignant("ens1", "ens1", "ens1@gmail.com", 062365412, dpriseDate, 1);
			Enseignant e2=new Enseignant("ens2", "ens2", "ens2@gmail.com", 062236521, dateprise2.getTime(), 2);
			Enseignant e3=new Enseignant("ens3", "ens3", "ens3@gmail.com", 022365412, dateprise3.getTime(), 3);
			Enseignant e4=new Enseignant("ens4", "ens4", "ens4@gmail.com", 042236521, dateprise4.getTime(), 4);
			
			
			
			e1.setMatiere(m1);
			e2.setMatiere(m3);
			e3.setMatiere(m2);
			e4.setMatiere(m4);
			
			List<Enseignant> enseignants=new ArrayList<>();
			enseignants.add(e1);
			enseignants.add(e2);
			enseignants.add(e3);
			enseignants.add(e4);
		
		d1.setEnseignants(enseignants);
		d1.setResponsable(e2);
		
		e1.setDepartement(d1);
		e2.setDepartement(d1);
		e3.setDepartement(d1);
		e4.setDepartement(d1);
//		emetier.ajouter(e1);
//		emetier.ajouter(e2);
		
		
		
//		List<Departement> departements=new ArrayList<Departement>();
//		
//		departements.add(d1);
//		departements.add(d2);
//		departements.add(d3);
		
		
		
		
		dmetier.ajouter(d1);
		dmetier.ajouter(d2);
		dmetier.ajouter(d3);
		
		Etudiant etud1=new Etudiant("etud1", "etud1", "etud1@gmail.com", 012356214, 2017);
		Etudiant etud2=new Etudiant("etud2", "etud2", "etud2@gmail.com", 032356214 , 2018);
		
	    EtudiantMetier etudmetier=new EtudiantMetier();
	  
	    etudmetier.ajouter(etud1);
	    etudmetier.ajouter(etud2);
	    
	   
	    
	    Noter n1=new Noter(12, m1, etud1);
	    Noter n2=new Noter(13, m2, etud1);
	    Noter n3=new Noter(10, m3, etud1);
	    Noter n4=new Noter(17, m4, etud1);
	    
	    Noter n5=new Noter(11, m1, etud2);
	    Noter n6=new Noter(14, m2, etud2);
	    Noter n7=new Noter(16, m3, etud2);
	    //Noter n8=new Noter(10, m4, etud2);
	    Noter n9=new Noter();
	    n9.setMatiere(m4);
	    n9.setEtudiant(etud2);
	    
	    
	    NoterMetier nmetier=new NoterMetier();
	    nmetier.ajouter(n1);
	    nmetier.ajouter(n2);
	    nmetier.ajouter(n3);
	    nmetier.ajouter(n4);
	    nmetier.ajouter(n5);
	    nmetier.ajouter(n6);
	    nmetier.ajouter(n7);
	//    nmetier.ajouter(n8);
	    nmetier.ajouter(n9);
	    
	    
	    
	}

}
