package com.oopspillars.ridehailingapplication;

public class Auto extends Vehicle {
	public Auto(String vehicleId, String driverName) {
		super(vehicleId, driverName, 10);
	}

	@Override
	public double calculateFare(double distance) {
		return distance * ratePerKm + 20; // base auto charge
	}
}
