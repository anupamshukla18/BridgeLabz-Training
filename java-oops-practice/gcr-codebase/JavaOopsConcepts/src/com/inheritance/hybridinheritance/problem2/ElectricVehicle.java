package com.inheritance.hybridinheritance.problem2;

public class ElectricVehicle extends Vehicle {
	public ElectricVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}

	void charge() {
		System.out.println("Electric vehicle is charging.");
	}
}