package com.oopspillars.ridehailingapplication;

public class Bike extends Vehicle {
	public Bike(String vehicleId, String driverName) {
		super(vehicleId, driverName, 8);
	}

	@Override
	public double calculateFare(double distance) {
		return distance * ratePerKm; // no extra charge
	}
}
