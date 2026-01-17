package com.sortingalgorithmsscneariobasedproblems.smartlibrary;

import java.util.Scanner;

public class SmartLibraryApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LibraryService service = new LibraryService();
		int choice;

		do {
			System.out.println("\n=== SmartLibrary Kiosk ===");
			System.out.println("1. Issue new book");
			System.out.println("2. Display borrowed books");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter book title: ");
				String title = sc.nextLine();
				service.addBook(new Book(title));
				System.out.println("Book added and sorted.");
				break;

			case 2:
				service.displayBooks();
				break;

			case 3:
				System.out.println("Exiting SmartLibrary...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 3);

		sc.close();
	}
}
