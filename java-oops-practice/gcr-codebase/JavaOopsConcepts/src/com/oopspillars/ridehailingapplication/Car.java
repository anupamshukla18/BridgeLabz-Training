package com.oopspillars.ridehailingapplication;

public class Car extends Vehicle {
	public Car(String vehicleId, String driverName) {
		super(vehicleId, driverName, 15); // base rate
	}

	@Override
	public double calculateFare(double distance) {
		return distance * ratePerKm + 50; // comfort surcharge
	}
}
