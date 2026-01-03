package com.cabbygoriderailingapp;

import java.util.Scanner;

public class CabbyGoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = null;

        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Sedan");
        System.out.println("2. Mini");
        System.out.println("3. SUV");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        // SWITCH for dynamic object creation
        switch (choice) {
            case 1:
                vehicle = new Sedan(vehicleNumber);
                break;
            case 2:
                vehicle = new Mini(vehicleNumber);
                break;
            case 3:
                vehicle = new SUV(vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle choice!");
                sc.close();
                return;
        }

        // Driver details
        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter License Number: ");
        String licenseNumber = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();

        Driver driver = new Driver(driverName, licenseNumber, rating);

        // Distance
        System.out.print("Enter Ride Distance (km): ");
        double distance = sc.nextDouble();

        IRideService rideService = new RideService();
        rideService.bookRide(vehicle, driver, distance);
        rideService.endRide();

        sc.close();
    }
}
