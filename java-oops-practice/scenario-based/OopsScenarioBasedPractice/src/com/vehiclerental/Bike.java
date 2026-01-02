package com.vehiclerental;

//Bike class
class Bike extends Vehicle implements Rentable {
	public Bike(String vehicleId, String brand, double baseRate) {
		super(vehicleId, brand, baseRate);
	}

	// Rent = baseRate × days
	@Override
	public double calculateRent(int days) {
		return baseRate * days;
	}
}
