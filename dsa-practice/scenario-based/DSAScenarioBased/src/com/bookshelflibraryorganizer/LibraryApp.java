package com.bookshelflibraryorganizer;

import java.util.Scanner;

public class LibraryApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("\n1. Add Book");
			System.out.println("2. Borrow Book");
			System.out.println("3. Display Library");
			System.out.println("4. Exit");
			System.out.print("Choose: ");

			int choice = sc.nextInt();
			sc.nextLine(); // clear buffer

			switch (choice) {
			case 1:
				System.out.print("Genre: ");
				String genre = sc.nextLine();

				System.out.print("Title: ");
				String title = sc.nextLine();

				System.out.print("Author: ");
				String author = sc.nextLine();

				library.addBook(genre, title, author);
				break;

			case 2:
				System.out.print("Genre: ");
				String g = sc.nextLine();

				System.out.print("Title: ");
				String t = sc.nextLine();

				library.borrowBook(g, t);
				break;

			case 3:
				library.displayLibrary();
				break;

			case 4:
				System.out.println("Exiting Library System...");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
