package com.cabbygoriderailingapp;

//SUV Vehicle
class SUV extends Vehicle {
	public SUV(String vehicleNumber) {
		super(vehicleNumber, 6, "SUV", 20);
	}

	@Override
	public double calculateFare(double distance) {
		double baseFare = 120;
		return baseFare + distance * getRatePerKm();
	}
}
