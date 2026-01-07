package com.smartparkingapplication;

class Bike extends Vehicle {
	public Bike(String vehicleNumber) {
		super(vehicleNumber);
	}

	@Override
	public double getBaseRate() {
		return 20;
	}
}
