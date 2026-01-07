package com.smartparkingapplication;

class Car extends Vehicle {
	public Car(String vehicleNumber) {
		super(vehicleNumber);
	}

	@Override
	public double getBaseRate() {
		return 50; // per hour
	}
}
