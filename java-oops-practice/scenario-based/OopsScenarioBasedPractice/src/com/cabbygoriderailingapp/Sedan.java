package com.cabbygoriderailingapp;

//Sedan Vehicle
class Sedan extends Vehicle {
	public Sedan(String vehicleNumber) {
		super(vehicleNumber, 4, "Sedan", 15);
	}

	@Override
	public double calculateFare(double distance) {
		double baseFare = 80;
		return baseFare + distance * getRatePerKm();
	}
}
