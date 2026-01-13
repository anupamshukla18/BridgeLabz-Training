package com.homenest;

import java.util.Scanner;

public class HomeNestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Device device = null;

		System.out.println("Register Device");
		System.out.println("1. Light");
		System.out.println("2. Camera");
		System.out.println("3. Thermostat");
		System.out.println("4. Lock");
		System.out.print("Choose device: ");
		int type = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Device ID: ");
		String id = sc.nextLine();

		switch (type) {
		case 1:
			device = new Light(id);
			break;
		case 2:
			device = new Camera(id);
			break;
		case 3:
			device = new Thermostat(id);
			break;
		case 4:
			device = new Lock(id);
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
		}

		int choice;
		do {
			System.out.println("\n--- HOME NEST MENU ---");
			System.out.println("1. Turn ON");
			System.out.println("2. Turn OFF");
			System.out.println("3. Reset Device");
			System.out.println("4. Calculate Energy Usage");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				device.turnOn();
				break;

			case 2:
				device.turnOff();
				break;

			case 3:
				device.reset(); // Polymorphism
				break;

			case 4:
				System.out.print("Enter hours used: ");
				int hours = sc.nextInt();
				System.out.println("Energy Used: " + device.calculateEnergy(hours) + " units");
				break;

			case 5:
				System.out.println("Exiting HomeNest");
				break;

			default:
				System.out.println("Invalid option");
			}

		} while (choice != 5);

		sc.close();
	}
}
