package com.sortingalgorithmsscneariobasedproblems.medwarehouse;

public class Medicine {

	private String name;
	private int expiryDays; // days remaining until expiry

	public Medicine(String name, int expiryDays) {
		this.name = name;
		this.expiryDays = expiryDays;
	}

	public int getExpiryDays() {
		return expiryDays;
	}

	@Override
	public String toString() {
		return name + " | Expires in " + expiryDays + " days";
	}
}
