package entities;

import javax.persistence.Embeddable;


@Embeddable
public class Adresse {
	
	private String rue;
	private String ville;
	private int codePOstale;
	

	
	
	public Adresse() {
		
	}
	public Adresse(String rue, String ville, int codePOstale) {
		
		this.rue = rue;
		this.ville = ville;
		this.codePOstale = codePOstale;
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
	public int getCodePOstale() {
		return codePOstale;
	}
	public void setCodePOstale(int codePOstale) {
		this.codePOstale = codePOstale;
	}
	@Override
	public String toString() {
		return "Adresse [  rue=" + rue + ", ville=" + ville + ", codePOstale=" + codePOstale
				+ "]";
	}

	
	

}
