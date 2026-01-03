package com.cabbygoriderailingapp;

import java.util.Scanner;

public class CabbyGoApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Dynamic vehicle input
		System.out.print("Enter Vehicle Number: ");
		String vehicleNumber = sc.nextLine();
		Vehicle vehicle = new Sedan(vehicleNumber); // Polymorphism

		// Dynamic driver input
		System.out.print("Enter Driver Name: ");
		String driverName = sc.nextLine();

		System.out.print("Enter License Number: ");
		String licenseNumber = sc.nextLine();

		System.out.print("Enter Driver Rating: ");
		double rating = sc.nextDouble();

		Driver driver = new Driver(driverName, licenseNumber, rating);

		// Distance input
		System.out.print("Enter Ride Distance (km): ");
		double distance = sc.nextDouble();

		// Interface-based service
		IRideService rideService = new RideService();
		rideService.bookRide(vehicle, driver, distance);
		rideService.endRide();

		sc.close();
	}
}
