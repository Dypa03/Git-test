package com.model;

public class Persona {
	// ATTRIBUTES
	String name;
	String arcana;
	int level;
	int strength;
	int magic;
	int agility;
	int resistance;
	int luck;

	// CONSTRUCTOR
	public Persona(String name, String arcana, int level, int strength, int magic, int agility, int resistance,
			int luck) {
		this.name = name;
		this.arcana = arcana;
		this.level = level;
		this.strength = strength;
		this.magic = magic;
		this.agility = agility;
		this.resistance = resistance;
		this.luck = luck;
	}

	public Persona(String name, String arcana) {
		this.name = name;
		this.arcana = arcana;
		this.level = 99;
		this.strength = 99;
		this.magic = 99;
		this.agility = 99;
		this.resistance = 99;
		this.luck = 99;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArcana() {
		return arcana;
	}

	public void setArcana(String arcana) {
		this.arcana = arcana;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

}
