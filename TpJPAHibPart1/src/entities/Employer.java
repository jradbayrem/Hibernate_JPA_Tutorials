package entities;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;






@Entity
public class Employer {

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_emp")
	private int id;
	
	@Column(name="nom_emp")
	private String nom;
	
	@Column(name="pre_emp")
	private String prenom;
	
	@Column(name="age_emp")
	private int age;
	
	@ManyToOne
	@JoinColumn(name="id_entreprise" )
	private Entreprise entreprise;
	
	
	@Embedded
	private Adresse adresse;
	
	@ManyToMany
	@JoinTable(name = "EMP_PROJ", joinColumns = @JoinColumn(name = "emp_id", referencedColumnName = "id_emp"), 
	inverseJoinColumns = @JoinColumn(name = "proj_id", referencedColumnName = "id_proj")

	)
	List<Projet> projets=new ArrayList<Projet>();
	
	@ManyToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;
	
	
	
	public Employer() {
		
	}
	
	public Employer(String nom, String prenom, int age) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	

	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", equipe="
				+ equipe + "]";
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	
	
	

}
