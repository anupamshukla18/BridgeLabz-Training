package com.cabbygoriderailingapp;

//Mini Vehicle
class Mini extends Vehicle {
	public Mini(String vehicleNumber) {
		super(vehicleNumber, 4, "Mini", 10);
	}

	@Override
	public double calculateFare(double distance) {
		double baseFare = 50;
		return baseFare + distance * getRatePerKm();
	}
}
