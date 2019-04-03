package entities;

import javax.persistence.Entity;

@Entity
public class Bowler extends Cricketer{
	
	private float bowlingAverage;
	
	

	public Bowler() {
		super();
	}

	public Bowler(String name, float battingAverage, float bowlingAverage) {
		super(name, battingAverage);
		this.bowlingAverage = bowlingAverage;
	}

	public float getBowlingAverage() {
		return bowlingAverage;
	}

	public void setBowlingAverage(float bowlingAverage) {
		this.bowlingAverage = bowlingAverage;
	}

	@Override
	public String toString() {
		return "Bowler [bowlingAverage=" + bowlingAverage + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
