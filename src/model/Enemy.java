package model;

public abstract class Enemy {
	
	String name = "default";
	int hitPoints = 1;
	int defence = 1;
	int strength = 1;
	int experience = 1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}


}
