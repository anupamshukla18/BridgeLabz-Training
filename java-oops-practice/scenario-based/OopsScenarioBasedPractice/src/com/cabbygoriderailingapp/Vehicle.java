package com.cabbygoriderailingapp;

//Abstract Vehicle class
abstract class Vehicle {
	private String vehicleNumber;
	private int capacity;
	private String type;

	// Hidden / sensitive data
	private double ratePerKm;

	// Constructor
	public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.ratePerKm = ratePerKm;
	}

	// Encapsulation (Getters only)
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getType() {
		return type;
	}

	protected double getRatePerKm() {
		return ratePerKm;
	}

	// Abstract method (Polymorphism)
	public abstract double calculateFare(double distance);
}
