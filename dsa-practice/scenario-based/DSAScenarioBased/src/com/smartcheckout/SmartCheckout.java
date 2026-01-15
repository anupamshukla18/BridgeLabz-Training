package com.smartcheckout;

import java.util.*;

public class SmartCheckout {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Store store = new Store();
		CheckoutCounter counter = new CheckoutCounter(store);

		// Preloaded items
		store.addItem("Milk", 50, 5);
		store.addItem("Bread", 30, 3);
		store.addItem("Eggs", 6, 10);

		int choice;

		do {
			System.out.println("\n--- SMART CHECKOUT MENU ---");
			System.out.println("1. Add Store Item");
			System.out.println("2. Add Customer");
			System.out.println("3. Process Billing");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1: // Add Store Item
				System.out.print("Enter item name: ");
				String item = sc.nextLine().trim();

				System.out.print("Enter price: ");
				int price = sc.nextInt();

				System.out.print("Enter stock: ");
				int stock = sc.nextInt();
				sc.nextLine();

				store.addItem(item, price, stock);
				System.out.println("Item added to store");
				break;

			case 2: // Add Customer
				System.out.print("Enter customer name: ");
				String name = sc.nextLine();

				System.out.print("Enter number of items: ");
				int n = sc.nextInt();
				sc.nextLine();

				List<String> items = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					System.out.print("Enter item " + (i + 1) + ": ");
					items.add(sc.nextLine().trim());
				}

				counter.addCustomer(new Customer(name, items));
				break;

			case 3: // Process Billing
				counter.processCustomer();
				break;

			case 4: // Exit
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 3);

		sc.close();
	}
}
