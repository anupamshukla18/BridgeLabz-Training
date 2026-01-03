package com.oopspillars.vehiclerentalsystem;

public interface Insurable {
	// Calculates insurance cost
	double calculateInsurance();

	// Returns insurance details (policy summary)
	String getInsuranceDetails();
}