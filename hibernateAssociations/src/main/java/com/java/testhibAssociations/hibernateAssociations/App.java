package com.java.testhibAssociations.hibernateAssociations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entitiesManyToMany.Employer;
import entitiesManyToMany.Projet;



/**
 * Hello world!
 *
 */
public class App 
{
	public static SessionFactory factory;
    public static void main( String[] args )
    {
    	factory = new Configuration().configure().buildSessionFactory();
    	
    	Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
		Employer e = new Employer();
		e.setNom("emp1");
		e.setPrenom("emppre");
		e.setAge(20);
		
		Employer e1 = new Employer();
		e.setNom("emp2");
		e.setPrenom("emppre2");
		e.setAge(20);
		
		Projet proj1=new Projet();
		proj1.setNom("projBiat");
		
		Projet proj2=new Projet();
		proj2.setNom("projATB");
		
		List<Projet> emprojets=new ArrayList<Projet>();
		emprojets.add(proj1);
		emprojets.add(proj2);
		
		List<Employer> emps = new ArrayList<Employer>();
		emps.add(e1);
		emps.add(e);
		
		proj1.setEmployers(emps);
		proj2.setEmployers(emps);
		
		e.setProjets(emprojets);
		e1.setProjets(emprojets);
		
		e.setProjets(emprojets);
		
//	
//		Adresse a=new Adresse();
//		a.setAdresse("paris");
//        a.setEmployer(e);
//		e.setAdresse(a);

	//	Employer emp=(Employer) session.get(Employer.class, 1);
		//Adresse ad=(Adresse) session.get(Adresse.class, 1);
		session.persist(e);
        //System.out.println(a.getEmployer());
		
		t.commit();
    }
}
