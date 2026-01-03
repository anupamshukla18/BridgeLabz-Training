package com.oopspillars.ridehailingapplication;

import java.util.*;

public class RideHailingApplication {
	// Polymorphic method
	public static void processFare(Vehicle vehicle, double distance) {

		vehicle.updateLocation("City Center");
		vehicle.getVehicleDetails();

		double fare = vehicle.calculateFare(distance);
		System.out.println("Distance Travelled: " + distance + " km");
		System.out.println("Total Fare: ₹" + fare);

		System.out.println("----------------------------------");
	}

	public static void main(String[] args) {
		List<Vehicle> rides = new ArrayList<>();

		rides.add(new Car("CAR101", "Anupam"));
		rides.add(new Bike("BIKE202", "Anuj"));
		rides.add(new Auto("AUTO303", "Vikash"));

		double distance = 12.5;

		for (Vehicle v : rides) {
			processFare(v, distance); // runtime polymorphism
		}
	}
}
