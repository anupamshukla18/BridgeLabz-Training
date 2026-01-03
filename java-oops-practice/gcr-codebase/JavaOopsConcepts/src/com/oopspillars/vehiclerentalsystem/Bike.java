package com.oopspillars.vehiclerentalsystem;

public class Bike extends Vehicle {
	public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return rentalRate * days; // no extra charge
	}

	@Override
	public double calculateInsurance() {
		return 300;
	}

	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance | Policy No: " + getInsurancePolicyNumber();
	}
}
