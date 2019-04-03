package SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@DiscriminatorValue("1")
@Entity
public class Directeur extends Employer {
	
	private String nomEquipe;
	

	public Directeur() {
		
	}

	public Directeur(String nom, String prenom, int age,String nomEquipe) {
		super(nom,prenom,age);
		this.nomEquipe = nomEquipe;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	
	

}
