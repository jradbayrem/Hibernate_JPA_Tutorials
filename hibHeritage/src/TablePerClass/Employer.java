package TablePerClass;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)


@Entity
public class Employer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
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
