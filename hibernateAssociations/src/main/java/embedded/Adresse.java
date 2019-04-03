package embedded;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Embeddable
public class Adresse implements Serializable{

	/**
	 * 
	 */
	
	
	

	
	@Column
	private String rue;
	
	
	@Column
	private String ville;
	
	@Column
	private int codePostale;
	
	
	public Adresse() {
		
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getCodePostale() {
		return codePostale;
	}


	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}






	

}
