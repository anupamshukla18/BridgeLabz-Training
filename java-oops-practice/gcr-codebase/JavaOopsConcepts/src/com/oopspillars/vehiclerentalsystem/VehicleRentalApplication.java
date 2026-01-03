package com.oopspillars.vehiclerentalsystem;

import java.util.*;

public class VehicleRentalApplication {
	public static void main(String[] args) {
		// Polymorphic list
		List<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("CAR101", 1500, "CAR-INS-111"));
		vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-222"));
		vehicles.add(new Truck("TRUCK303", 3000, "TRUCK-INS-333"));

		int rentalDays = 5;

		// Polymorphism in action
		for (Vehicle v : vehicles) {
			System.out.println("Vehicle Type: " + v.getType());
			System.out.println("Vehicle Number: " + v.getVehicleNumber());

			double rentalCost = v.calculateRentalCost(rentalDays);
			double insuranceCost = v.calculateInsurance();

			System.out.println("Rental Cost for " + rentalDays + " days: ₹" + rentalCost);
			System.out.println("Insurance Cost: ₹" + insuranceCost);
			System.out.println("Insurance Info: " + v.getInsuranceDetails());
			System.out.println("----------------------------------");
		}
	}
}
