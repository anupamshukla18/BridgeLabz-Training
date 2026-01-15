package com.parceltracker;

import java.util.*;

public class ParcelTracker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ParcelTrackerList list = new ParcelTrackerList();

		int choice;

		do {
			System.out.println("\n--- PARCEL TRACKER MENU ---");
			System.out.println("1. Add Stage");
			System.out.println("2. Add Intermediate Checkpoint");
			System.out.println("3. Display Tracking");
			System.out.println("4. Mark Parcel Lost");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter stage name: ");
				String stage = sc.nextLine();
				list.addStage(stage);
				System.out.println("Stage added");
				break;

			case 2:
				System.out.print("Enter existing stage: ");
				String existing = sc.nextLine();

				System.out.print("Enter new checkpoint: ");
				String newStage = sc.nextLine();

				list.addAfter(existing, newStage);
				break;

			case 3:
				list.displayStages();
				break;

			case 4:
				System.out.print("Enter stage after which parcel is lost: ");
				String lostStage = sc.nextLine();
				list.markLostAfter(lostStage);
				break;

			case 5:
				System.out.println("Exiting tracker...");
				break;

			default:
				System.out.println("Invalid choice");
			}

		} while (choice != 5);

		sc.close();
	}
}
