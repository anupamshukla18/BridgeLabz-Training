package com.sortingalgorithmsscneariobasedproblems.fleetmanager;

import java.util.Scanner;

public class FleetManagerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FleetService service = new FleetService();

		System.out.print("Enter total number of vehicles: ");
		int n = sc.nextInt();

		Vehicle[] vehicles = new Vehicle[n];

		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter vehicle ID: ");
			String id = sc.next();

			System.out.print("Enter mileage: ");
			int mileage = sc.nextInt();

			vehicles[i] = new Vehicle(id, mileage);
		}

		int choice;
		do {
			System.out.println("\n=== Fleet Maintenance Scheduler ===");
			System.out.println("1. Sort vehicles by mileage");
			System.out.println("2. Display maintenance schedule");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				service.mergeSort(vehicles, 0, vehicles.length - 1);
				System.out.println("Vehicles sorted using Merge Sort.");
				break;

			case 2:
				service.displayVehicles(vehicles);
				break;

			case 3:
				System.out.println("Exiting FleetManager...");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 3);

		sc.close();
	}
}
