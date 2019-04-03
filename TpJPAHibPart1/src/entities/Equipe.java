package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_equipe")
	private int idEquipe;
	
	@Column(name="nom_equipe")
	private String nomEquipe;
	
	@OneToMany(mappedBy="equipe")
	private List<Employer> employees;
	
	public Equipe() {
		
	}


	public Equipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	
	
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}


	public List<Employer> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employer> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Equipe [nomEquipe=" + nomEquipe + "]";
	}
	
	
}
