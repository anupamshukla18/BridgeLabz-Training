package com.sortingalgorithmsscneariobasedproblems.artexpo;

import java.util.Scanner;

public class ArtExpoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArtExpoService service = new ArtExpoService();
		int choice;

		do {
			System.out.println("\n=== ArtExpo Registration System ===");
			System.out.println("1. Register Artist");
			System.out.println("2. Display Artist List");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter artist name: ");
				String name = sc.next();

				System.out.print("Enter registration time: ");
				int time = sc.nextInt();

				service.addArtist(new Artist(name, time));
				System.out.println("Artist registered successfully.");
				break;

			case 2:
				service.displayArtists();
				break;

			case 3:
				System.out.println("Exiting ArtExpo system...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 3);

		sc.close();
	}
}
