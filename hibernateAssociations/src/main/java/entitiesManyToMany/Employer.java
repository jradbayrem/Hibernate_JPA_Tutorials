package entitiesManyToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Employer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="EMP_PROJ" , 
			joinColumns=@JoinColumn(name="emp_id" ,referencedColumnName="id_emp"),
		    inverseJoinColumns=@JoinColumn(name="proj_id" ,referencedColumnName="id_proj")
		
			)
	
	List<Projet> projets=new ArrayList<Projet>();
	
	
	public Employer() {
		
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
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	
	

}
