package entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


@Entity
public class Entreprise{


	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_entreprise")
	private int id;
	
	@Column
	private String nom;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="entreprise",fetch=FetchType.LAZY)		
	List<Employer> employers=new ArrayList<Employer>();

	
	public Entreprise() {
		
	}


	public Entreprise(String nom) {
		this.nom = nom;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<Employer> getEmployers() {
		return employers;
	}


	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}


	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + "]";
	}





	
	

}
