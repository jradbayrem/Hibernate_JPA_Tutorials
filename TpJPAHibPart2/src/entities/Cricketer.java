package entities;

import javax.persistence.Entity;

@Entity
public class Cricketer extends Player{
	
	private float battingAverage;
	
	

	public Cricketer() {
		super();
	}

	public Cricketer(String name, float battingAverage) {
		super(name);
		this.setBattingAverage(battingAverage);
	}

	public float getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}

	@Override
	public String toString() {
		return "Cricketer [battingAverage=" + battingAverage + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
