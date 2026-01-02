package com.vehiclerental;

//Truck class
class Truck extends Vehicle implements Rentable {
	public Truck(String vehicleId, String brand, double baseRate) {
		super(vehicleId, brand, baseRate);
	}

	// Rent
	@Override
	public double calculateRent(int days) {
		return (baseRate * days) + (days * 1000);
	}
}
