package com.model;

public class Medicine {
	// ATTRIBUTES
	String name;
	String effect;
	int amount;

	// CONSTRUCTOR
	public Medicine(String name, String effect, int amount) {
		super();
		this.name = name;
		this.effect = effect;
		this.amount = amount;
	};

	public Medicine(String name, String effect) {
		super();
		this.name = name;
		this.effect = effect;
		this.amount = 1;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	};

}
