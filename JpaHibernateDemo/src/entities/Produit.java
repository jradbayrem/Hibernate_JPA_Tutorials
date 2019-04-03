package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name="produits")
public class Produit {
	
	@Id
	private int idProduit;
	
	@Column(name="nom_produit")
	private String nomProduit;
	
	
	
	
	

	public Produit() {
		
	}

	public Produit(int idProduit, String nomProduit) {
		
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + "]";
	}
	
	
	

}
