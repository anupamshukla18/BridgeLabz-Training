package com.digitalbookstoresystem;

import java.util.Scanner;

public class BookBazaarApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== Welcome to BookBazaar =====");

		// ---------- User ----------
		System.out.print("Enter User Name: ");
		String userName = sc.nextLine();

		Order order = new Order(userName);

		boolean running = true;

		// ---------- Menu Loop ----------
		while (running) {

			System.out.println("\nChoose Book Type:");
			System.out.println("1. E-Book");
			System.out.println("2. Printed Book");
			System.out.println("0. Checkout");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1: {
				try {
					sc.nextLine(); // consume newline

					System.out.print("Enter Title: ");
					String title = sc.nextLine();

					System.out.print("Enter Author: ");
					String author = sc.nextLine();

					System.out.print("Enter Price: ");
					double price = sc.nextDouble();

					System.out.print("Enter Stock: ");
					int stock = sc.nextInt();

					System.out.print("Enter Quantity: ");
					int qty = sc.nextInt();

					Book ebook = new EBook(title, author, price, stock);
					order.addBook(ebook, qty);

					System.out.println("E-Book added successfully");

				} catch (IllegalArgumentException e) {
					System.out.println("No " + e.getMessage());
				}
				break;
			}

			case 2: {
				try {
					sc.nextLine(); // consume newline

					System.out.print("Enter Title: ");
					String title = sc.nextLine();

					System.out.print("Enter Author: ");
					String author = sc.nextLine();

					System.out.print("Enter Price: ");
					double price = sc.nextDouble();

					System.out.print("Enter Stock: ");
					int stock = sc.nextInt();

					System.out.print("Enter Quantity: ");
					int qty = sc.nextInt();

					Book printedBook = new PrintedBook(title, author, price, stock);
					order.addBook(printedBook, qty);

					System.out.println("Printed Book added successfully ✅");

				} catch (IllegalArgumentException e) {
					System.out.println("No " + e.getMessage());
				}
				break;
			}

			case 0:
				running = false; // exit loop safely
				break;

			default:
				System.out.println("Invalid choice ❌");
			}
		}

		// ---------- Order Summary ----------
		System.out.println("\n===== ORDER SUMMARY =====");
		System.out.println("User: " + userName);
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Total Amount Payable: ₹" + order.calculateTotalCost());

		// Close scanner only once, at the very end
		sc.close();
	}
}
