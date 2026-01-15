package com.sortingalgorithmsscneariobasedproblems.smartshelf;

import java.util.Scanner;

// Driver class
public class SmartShelfApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartShelf shelf = new SmartShelf();

		while (true) {
			System.out.println("\n--- SmartShelf Menu ---");
			System.out.println("1. Add Book");
			System.out.println("2. Display Books");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); // clear buffer

			switch (choice) {
			case 1:
				System.out.print("Enter book title: ");
				String title = sc.nextLine();
				shelf.addBook(title);
				System.out.println("Book added and sorted successfully.");
				break;

			case 2:
				shelf.displayBooks();
				break;

			case 3:
				System.out.println("Exiting SmartShelf. Goodbye!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
