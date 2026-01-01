package com.inheritance.assistedproblems.vehicle;

class Motorcycle extends Vehicle {
	boolean hasGear;

	Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
		super(maxSpeed, fuelType);
		this.hasGear = hasGear;
	}

	// Override
	void displayInfo() {
		System.out.println("---- Motorcycle Details ----");
		super.displayInfo();
		System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
		System.out.println();
	}
}