package com.sortingalgorithmsscneariobasedproblems.icecreamrush;

import java.util.Scanner;

public class IceCreamRushApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IceCreamService service = new IceCreamService();

		System.out.print("Enter number of flavors: ");
		int n = sc.nextInt();

		Flavor[] flavors = new Flavor[n];

		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter flavor name: ");
			String name = sc.next();

			System.out.print("Enter weekly sales count: ");
			int sales = sc.nextInt();

			flavors[i] = new Flavor(name, sales);
		}

		int choice;
		do {
			System.out.println("\n=== IceCreamRush Menu ===");
			System.out.println("1. Sort flavors by popularity");
			System.out.println("2. Display flavor list");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				service.bubbleSort(flavors);
				System.out.println("Flavors sorted using Bubble Sort.");
				break;

			case 2:
				service.displayFlavors(flavors);
				break;

			case 3:
				System.out.println("Exiting IceCreamRush...");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 3);

		sc.close();
	}
}
