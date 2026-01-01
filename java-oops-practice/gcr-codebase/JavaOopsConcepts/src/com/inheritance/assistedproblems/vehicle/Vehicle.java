package com.inheritance.assistedproblems.vehicle;

class Vehicle {
	int maxSpeed;
	String fuelType;

	Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}

	void displayInfo() {
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Fuel Type: " + fuelType);
	}
}