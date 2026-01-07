package com.smartparkingapplication;

class Truck extends Vehicle {
	public Truck(String vehicleNumber) {
		super(vehicleNumber);
	}

	@Override
	public double getBaseRate() {
		return 100;
	}
}
