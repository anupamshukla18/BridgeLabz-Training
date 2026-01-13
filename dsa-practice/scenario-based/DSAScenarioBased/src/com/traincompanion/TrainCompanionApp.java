package com.traincompanion;

import java.util.Scanner;

public class TrainCompanionApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Train train = new Train();

		while (true) {

			System.out.println("\n====== Train Companion Menu ======");
			System.out.println("1. Add Compartment");
			System.out.println("2. Remove Compartment");
			System.out.println("3. Traverse Forward");
			System.out.println("4. Traverse Backward");
			System.out.println("5. Search Service (WiFi / Pantry)");
			System.out.println("6. Show Adjacent Compartments");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");

			String input = sc.nextLine();
			int choice;

			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
				continue;
			}

			switch (choice) {

			case 1:
				System.out.print("Enter compartment name: ");
				String name = sc.nextLine();

				System.out.print("Has WiFi? (yes/no): ");
				boolean wifi = sc.nextLine().equalsIgnoreCase("yes");

				System.out.print("Has Pantry? (yes/no): ");
				boolean pantry = sc.nextLine().equalsIgnoreCase("yes");

				train.addCompartment(name, wifi, pantry);
				System.out.println("Compartment added.");
				break;

			case 2:
				System.out.print("Enter compartment name to remove: ");
				train.removeCompartment(sc.nextLine());
				break;

			case 3:
				train.traverseForward();
				break;

			case 4:
				train.traverseBackward();
				break;

			case 5:
				System.out.print("Enter service (wifi/pantry): ");
				train.searchService(sc.nextLine());
				break;

			case 6:
				System.out.print("Enter compartment name: ");
				train.showAdjacent(sc.nextLine());
				break;

			case 0:
				System.out.println("Exiting Train Companion App");
				sc.close();
				return;

			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}
}
