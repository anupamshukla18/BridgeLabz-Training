package com.smartparkingapplication;

abstract class Vehicle {
	protected String vehicleNumber;

	public Vehicle(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public abstract double getBaseRate();
}
