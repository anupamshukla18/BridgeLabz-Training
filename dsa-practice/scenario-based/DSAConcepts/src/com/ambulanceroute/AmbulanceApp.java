package com.ambulanceroute;

import java.util.Scanner;

public class AmbulanceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AmbulanceManager manager = new AmbulanceManager();

		while (true) {
			System.out.println("\n=== Ambulance Route Menu ===");
			System.out.println("1. Redirect Patient");
			System.out.println("2. Remove Unit (Maintenance)");
			System.out.println("3. Display Units");
			System.out.println("4. Exit");
			System.out.print("Choose: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				manager.redirectPatient();
				break;

			case 2:
				System.out.print("Enter unit name: ");
				String unit = sc.nextLine();
				manager.removeUnit(unit);
				break;

			case 3:
				manager.displayUnits();
				break;

			case 4:
				System.out.println("System shutting down...");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
