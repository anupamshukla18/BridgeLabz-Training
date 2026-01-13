package com.gamebox;

import java.util.Scanner;

public class GameBoxApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter user name: ");
		User user = new User(sc.nextLine());

		Game game = null;
		int choice;

		do {
			System.out.println("\n--- GAMEBOX MENU ---");
			System.out.println("1. Create Arcade Game");
			System.out.println("2. Create Strategy Game");
			System.out.println("3. Play Demo");
			System.out.println("4. Download Game");
			System.out.println("5. Buy Game");
			System.out.println("6. Apply Seasonal Offer");
			System.out.println("7. View My Games");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Title: ");
				String at = sc.nextLine();
				System.out.print("Price: ");
				double ap = sc.nextDouble();
				System.out.print("Rating: ");
				double ar = sc.nextDouble();
				game = new ArcadeGame(at, ap, ar);
				break;

			case 2:
				System.out.print("Title: ");
				String st = sc.nextLine();
				System.out.print("Price: ");
				double sp = sc.nextDouble();
				System.out.print("Rating: ");
				double sr = sc.nextDouble();
				game = new StrategyGame(st, sp, sr);
				break;

			case 3:
				if (game != null)
					game.playDemo(); // Polymorphism
				else
					System.out.println("No game selected.");
				break;

			case 4:
				if (game != null)
					game.download();
				else
					System.out.println("No game selected.");
				break;

			case 5:
				if (game != null)
					user.buyGame(game);
				else
					System.out.println("No game selected.");
				break;

			case 6:
				if (game != null) {
					System.out.print("Discount %: ");
					double d = sc.nextDouble();
					game.applyDiscount(d);
					System.out.println("New Price: " + game.price);
				} else {
					System.out.println("No game selected.");
				}
				break;

			case 7:
				user.showLibrary();
				break;

			case 8:
				System.out.println("Exiting GameBox");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 8);

		sc.close();
	}
}
