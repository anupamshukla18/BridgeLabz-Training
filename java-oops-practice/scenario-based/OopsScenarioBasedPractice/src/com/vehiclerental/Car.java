package com.vehiclerental;

//Car class
class Car extends Vehicle implements Rentable {
	public Car(String vehicleId, String brand, double baseRate) {
		super(vehicleId, brand, baseRate);
	}

	// Rent 
	@Override
	public double calculateRent(int days) {
		return (baseRate * days) + 500;
	}
}
