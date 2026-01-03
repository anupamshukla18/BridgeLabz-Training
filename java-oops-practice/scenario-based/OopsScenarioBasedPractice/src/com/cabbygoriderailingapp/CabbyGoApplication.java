package com.cabbygoriderailingapp;

public class CabbyGoApplication {
	public static void main(String[] args) {
		// Polymorphism: Vehicle reference
		Vehicle vehicle = new Sedan("MH12AB1234");

		Driver driver = new Driver("Rahul Sharma", "DL12345", 4.8);

		IRideService rideService = new RideService();

		rideService.bookRide(vehicle, driver, 12.5);
		rideService.endRide();
	}
}
