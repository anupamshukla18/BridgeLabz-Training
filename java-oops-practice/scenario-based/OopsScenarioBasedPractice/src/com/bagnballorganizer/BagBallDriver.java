package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BagBallDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Bag> bags = new ArrayList<>();
		int choice;

		do {
			System.out.println("\n===== Bag-n-Ball Organizer =====");
			System.out.println("1. Create Bag");
			System.out.println("2. Add Ball to Bag");
			System.out.println("3. Remove Ball from Bag");
			System.out.println("4. Display Balls in a Bag");
			System.out.println("5. Display All Bags");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Bag ID: ");
				String bagId = sc.next();
				System.out.print("Enter Bag Color: ");
				String bagColor = sc.next();
				System.out.print("Enter Bag Capacity: ");
				int capacity = sc.nextInt();
				bags.add(new Bag(bagId, bagColor, capacity));
				System.out.println("Bag created successfully.");
				break;

			case 2:
				System.out.print("Enter Bag ID: ");
				bagId = sc.next();
				Bag bag = findBag(bags, bagId);

				if (bag == null) {
					System.out.println("Bag not found.");
					break;
				}

				System.out.print("Enter Ball ID: ");
				String ballId = sc.next();
				System.out.print("Enter Ball Color: ");
				String ballColor = sc.next();
				System.out.print("Enter Ball Size (small/medium/large): ");
				String size = sc.next();

				Ball ball = new Ball(ballId, ballColor, size);
				if (bag.addBall(ball)) {
					System.out.println("Ball added successfully.");
				} else {
					System.out.println("Bag is full. Cannot add ball.");
				}
				break;

			case 3:
				System.out.print("Enter Bag ID: ");
				bagId = sc.next();
				bag = findBag(bags, bagId);

				if (bag == null) {
					System.out.println("Bag not found.");
					break;
				}

				System.out.print("Enter Ball ID to remove: ");
				ballId = sc.next();

				if (bag.removeBall(ballId)) {
					System.out.println("Ball removed successfully.");
				} else {
					System.out.println("Ball not found.");
				}
				break;

			case 4:
				System.out.print("Enter Bag ID: ");
				bagId = sc.next();
				bag = findBag(bags, bagId);

				if (bag != null) {
					bag.displayBalls();
				} else {
					System.out.println("Bag not found.");
				}
				break;

			case 5:
				if (bags.isEmpty()) {
					System.out.println("No bags available.");
				} else {
					for (Bag b : bags) {
						System.out.println(
								"Bag ID: " + b.getId() + ", Color: " + b.getColor() + ", Balls: " + b.getBallCount());
					}
				}
				break;

			case 6:
				System.out.println("Exiting application.");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 6);

		sc.close();
	}

	private static Bag findBag(List<Bag> bags, String id) {
		for (Bag b : bags) {
			if (b.getId().equals(id)) {
				return b;
			}
		}
		return null;
	}
}
