package com.groceryshoppingapplication;

import java.util.Scanner;

public class SwiftCartApplication {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();

		int choice;
		do {
			System.out.println("\n===== SwiftCart Menu =====");
			System.out.println("1. Add Perishable Product");
			System.out.println("2. Add Non-Perishable Product");
			System.out.println("3. Checkout");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Product Name: ");
				sc.nextLine();
				String pname1 = sc.nextLine();
				System.out.print("Enter Price: ");
				double price1 = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int qty1 = sc.nextInt();

				Product perishable = new PerishableProduct(pname1, price1, qty1);
				cart.addProduct(perishable);
				System.out.println("Perishable product added!");
				break;

			case 2:
				System.out.print("Enter Product Name: ");
				sc.nextLine();
				String pname2 = sc.nextLine();
				System.out.print("Enter Price: ");
				double price2 = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int qty2 = sc.nextInt();

				Product nonPerishable = new NonPerishableProduct(pname2, price2, qty2);
				cart.addProduct(nonPerishable);
				System.out.println("Non-Perishable product added!");
				break;

			case 3:
				cart.applyDiscount();
				cart.generateBill();
				break;

			case 0:
				System.out.println("Thank you for using SwiftCart!");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 0);

		sc.close();
	}
}
