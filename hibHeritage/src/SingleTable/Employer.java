package SingleTable;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_emp",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("0")

@Entity
public class Employer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmployer;
	private String nom;
	private String prenom;
	private int age;
	
	
	
	
	public Employer() {
		
	}
	public Employer(String nom, String prenom, int age) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public int getIdEmployer() {
		return idEmployer;
	}
	public void setIdEmployer(int idEmployer) {
		this.idEmployer = idEmployer;
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
	@Override
	public String toString() {
		return "Employer [idEmployer=" + idEmployer + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	

}
