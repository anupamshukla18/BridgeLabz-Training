package com.linkedlist.doubly.moviemanagement;

import java.util.*;

public class MovieManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieDoublyLinkedList movies = new MovieDoublyLinkedList();
		int choice;

		do {
			System.out.println("\n=== Movie Management System ===");
			System.out.println("1. Add Movie at Beginning");
			System.out.println("2. Add Movie at End");
			System.out.println("3. Add Movie at Position");
			System.out.println("4. Remove Movie by Title");
			System.out.println("5. Search Movie by Director");
			System.out.println("6. Search Movie by Rating");
			System.out.println("7. Update Movie Rating");
			System.out.println("8. Display Movies Forward");
			System.out.println("9. Display Movies Reverse");
			System.out.println("10. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // clear buffer

			String title, director;
			int year, pos;
			double rating;

			switch (choice) {
			case 1:
				System.out.print("Title: ");
				title = sc.nextLine();
				System.out.print("Director: ");
				director = sc.nextLine();
				System.out.print("Year: ");
				year = sc.nextInt();
				System.out.print("Rating: ");
				rating = sc.nextDouble();
				movies.addAtBeginning(title, director, year, rating);
				break;

			case 2:
				System.out.print("Title: ");
				title = sc.nextLine();
				System.out.print("Director: ");
				director = sc.nextLine();
				System.out.print("Year: ");
				year = sc.nextInt();
				System.out.print("Rating: ");
				rating = sc.nextDouble();
				movies.addAtEnd(title, director, year, rating);
				break;

			case 3:
				System.out.print("Position: ");
				pos = sc.nextInt();
				sc.nextLine();
				System.out.print("Title: ");
				title = sc.nextLine();
				System.out.print("Director: ");
				director = sc.nextLine();
				System.out.print("Year: ");
				year = sc.nextInt();
				System.out.print("Rating: ");
				rating = sc.nextDouble();
				movies.addAtPosition(pos, title, director, year, rating);
				break;

			case 4:
				System.out.print("Enter Movie Title: ");
				movies.removeByTitle(sc.nextLine());
				break;

			case 5:
				System.out.print("Enter Director Name: ");
				movies.searchByDirector(sc.nextLine());
				break;

			case 6:
				System.out.print("Enter Rating: ");
				movies.searchByRating(sc.nextDouble());
				break;

			case 7:
				System.out.print("Enter Movie Title: ");
				title = sc.nextLine();
				System.out.print("Enter New Rating: ");
				rating = sc.nextDouble();
				movies.updateRating(title, rating);
				break;

			case 8:
				movies.displayForward();
				break;

			case 9:
				movies.displayReverse();
				break;

			case 10:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 10);

		sc.close();
	}
}
