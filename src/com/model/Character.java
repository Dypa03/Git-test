package com.model;

public class Character {

	// ATTRIBUTES
	String firstName;
	String lastName;
	int age;

	// CONSTRUCTOR
	public Character(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// SECOND CONSTRUCTOR lo possiamo creare poiché ha una
	// firma diversa dal precedente
	Character(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 18;
	}

	// GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
