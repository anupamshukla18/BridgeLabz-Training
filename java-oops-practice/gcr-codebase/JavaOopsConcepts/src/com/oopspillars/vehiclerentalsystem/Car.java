package com.oopspillars.vehiclerentalsystem;

public class Car extends Vehicle {
	public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return rentalRate * days + 500; // luxury surcharge
	}

	@Override
	public double calculateInsurance() {
		return 1000;
	}

	@Override
	public String getInsuranceDetails() {
		return "Car Insurance | Policy No: " + getInsurancePolicyNumber();
	}
}
