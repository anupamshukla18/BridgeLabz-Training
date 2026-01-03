package com.oopspillars.ridehailingapplication;

public abstract class Vehicle implements GPS {
	// Encapsulated fields
	private String vehicleId;
	private String driverName;
	protected double ratePerKm;

	// GPS data (private)
	private String currentLocation;

	// Constructor
	public Vehicle(String vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
		this.currentLocation = "Not Updated";
	}

	// Abstract method
	public abstract double calculateFare(double distance);

	// Concrete method
	public void getVehicleDetails() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Driver Name: " + driverName);
		System.out.println("Rate Per Km: ₹" + ratePerKm);
		System.out.println("Current Location: " + currentLocation);
	}

	// GPS interface methods
	@Override
	public String getCurrentLocation() {
		return currentLocation;
	}

	@Override
	public void updateLocation(String newLocation) {
		this.currentLocation = newLocation;
	}
}
