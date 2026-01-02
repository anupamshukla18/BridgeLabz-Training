package com.vehiclerental;

//Base class Vehicle
class Vehicle {
	// instance variable
	protected String vehicleId;
	protected String brand;
	protected double baseRate;

	// Constructor
	public Vehicle(String vehicleId, String brand, double baseRate) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.baseRate = baseRate;

	}

	// Encapsulation: getters
	public String getVehicleId() {
		return vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public double getBaseRate() {
		return baseRate;
	}
}
