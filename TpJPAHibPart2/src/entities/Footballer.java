package entities;

import javax.persistence.Entity;

@Entity
public class Footballer extends Player{
	
	
	private String club;
	
	

	public Footballer() {
		super();
	}

	public Footballer(String name, String club) {
		super(name);
		this.setClub(club);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Footballer [club=" + club + ", id=" + id + ", name=" + name + "]";
	}

	
	
}
