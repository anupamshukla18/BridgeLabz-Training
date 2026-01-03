package com.oopspillars.vehiclerentalsystem;

public abstract class Vehicle implements Insurable {
	// Encapsulated fields
	private String vehicleNumber;
	private String type;
	protected double rentalRate; // protected for subclass access

	// Insurance data (sensitive → private)
	private String insurancePolicyNumber;

	// Constructor
	public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = insurancePolicyNumber;
	}

	// Abstract method (must be implemented by subclasses)
	public abstract double calculateRentalCost(int days);

	// Encapsulation via getters
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getType() {
		return type;
	}

	protected String getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}
}
