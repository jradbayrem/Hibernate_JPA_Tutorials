package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Entity
abstract public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected int id;	
	protected String name;
	
	
	
	
	public Player() {
		
	}


	public Player(String name) {
		
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
	

}
