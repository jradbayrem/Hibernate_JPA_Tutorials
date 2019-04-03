package entitiesOneToOne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Adresse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adresse")
	private int id;
	
	@Column
	private String adresse;
	
	
	@OneToOne(mappedBy="adresse")
	private Employer employer;

	
	public Adresse() {
		
	}



	public Employer getEmployer() {
		return employer;
	}



	public void setEmployer(Employer employer) {
		this.employer = employer;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	

}
