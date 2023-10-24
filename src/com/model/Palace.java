package com.model;

public class Palace {
	// ATTRIBUTES
	String master;
	String place;
	String keyword;

	// CONSTRUCTOR
	public Palace(String master, String place, String keyword) {
		this.master = master;
		this.place = place;
		this.keyword = keyword;
	}

	// GETTERS AND SETTERS
	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
