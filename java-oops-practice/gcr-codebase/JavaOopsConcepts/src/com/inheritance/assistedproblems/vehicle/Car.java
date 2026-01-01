package com.inheritance.assistedproblems.vehicle;

class Car extends Vehicle {
	int seatCapacity;

	Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}

	// Override
	void displayInfo() {
		System.out.println("---- Car Details ----");
		super.displayInfo();
		System.out.println("Seat Capacity: " + seatCapacity);
		System.out.println();
	}
}