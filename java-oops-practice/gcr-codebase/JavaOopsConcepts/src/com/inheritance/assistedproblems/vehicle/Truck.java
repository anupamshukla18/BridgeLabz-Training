package com.inheritance.assistedproblems.vehicle;

class Truck extends Vehicle {
	int loadCapacity;

	Truck(int maxSpeed, String fuelType, int loadCapacity) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}

	// Override
	void displayInfo() {
		System.out.println("---- Truck Details ----");
		super.displayInfo();
		System.out.println("Load Capacity: " + loadCapacity + " tons");
		System.out.println();
	}
}
