package com.model;

public class Weapon {

	// ATTRIBUTES
	String name;
	String type;
	int damage;
	int accuracy;

	// CONSTRUCTOR
	public Weapon(String name, String type, int damage, int accuracy) {
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.accuracy = accuracy;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

}
