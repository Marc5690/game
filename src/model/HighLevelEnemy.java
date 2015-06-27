package model;

public class HighLevelEnemy  extends Enemy{
	
	public HighLevelEnemy(String name, int hitPoints, int defence, int strength, int experience){
		super();
		this.setName(name);
		this.setHitPoints(hitPoints);
		this.setDefence(defence);
		this.setStrength(strength);
		this.setExperience(experience);
	}

}
