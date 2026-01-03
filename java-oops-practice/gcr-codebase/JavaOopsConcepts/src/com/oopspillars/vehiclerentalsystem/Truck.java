package com.oopspillars.vehiclerentalsystem;

public class Truck extends Vehicle {
	public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return rentalRate * days + 1000; // heavy load surcharge
	}

	@Override
	public double calculateInsurance() {
		return 2000;
	}

	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance | Policy No: " + getInsurancePolicyNumber();
	}
}
