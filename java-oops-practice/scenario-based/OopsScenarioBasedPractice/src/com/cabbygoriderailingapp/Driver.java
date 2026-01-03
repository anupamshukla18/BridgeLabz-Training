package com.cabbygoriderailingapp;

// Driver class
class Driver {
	private String name;
	private String licenseNumber;
	private double rating;

	// Constructor
	public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

	// Getters
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}
}
