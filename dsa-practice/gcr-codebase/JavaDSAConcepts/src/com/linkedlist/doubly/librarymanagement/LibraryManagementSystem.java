package com.linkedlist.doubly.librarymanagement;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();
		int choice;

		do {
			System.out.println("\n=== Library Management System ===");
			System.out.println("1. Add Book at Beginning");
			System.out.println("2. Add Book at End");
			System.out.println("3. Add Book at Position");
			System.out.println("4. Remove Book by ID");
			System.out.println("5. Search Book by Title");
			System.out.println("6. Search Book by Author");
			System.out.println("7. Update Availability");
			System.out.println("8. Display Books Forward");
			System.out.println("9. Display Books Reverse");
			System.out.println("10. Count Books");
			System.out.println("11. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			int id, pos;
			String title, author, genre;
			boolean status;

			switch (choice) {
			case 1:
			case 2:
			case 3:
				if (choice == 3) {
					System.out.print("Position: ");
					pos = sc.nextInt();
					sc.nextLine();
				} else
					pos = 0;

				System.out.print("Book ID: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Title: ");
				title = sc.nextLine();
				System.out.print("Author: ");
				author = sc.nextLine();
				System.out.print("Genre: ");
				genre = sc.nextLine();
				System.out.print("Available (true/false): ");
				status = sc.nextBoolean();

				if (choice == 1)
					library.addAtBeginning(id, title, author, genre, status);
				else if (choice == 2)
					library.addAtEnd(id, title, author, genre, status);
				else
					library.addAtPosition(pos, id, title, author, genre, status);
				break;

			case 4:
				System.out.print("Book ID: ");
				library.removeById(sc.nextInt());
				break;

			case 5:
				System.out.print("Title: ");
				library.searchByTitle(sc.nextLine());
				break;

			case 6:
				System.out.print("Author: ");
				library.searchByAuthor(sc.nextLine());
				break;

			case 7:
				System.out.print("Book ID: ");
				id = sc.nextInt();
				System.out.print("Available (true/false): ");
				status = sc.nextBoolean();
				library.updateAvailability(id, status);
				break;

			case 8:
				library.displayForward();
				break;

			case 9:
				library.displayReverse();
				break;

			case 10:
				library.countBooks();
				break;

			case 11:
				System.out.println("Exiting system...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 11);

		sc.close();
	}
}
