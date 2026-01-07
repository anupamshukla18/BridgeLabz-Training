package com.eventmanagementplatform;

import java.util.Scanner;

public class EventEaseApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Event event = null;

		System.out.println("Welcome to EventEase – Event Management Platform");

		// Organizer details
		System.out.print("Enter Organizer Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Email: ");
		String email = sc.nextLine();

		System.out.print("Enter Phone: ");
		String phone = sc.nextLine();

		User organizer = new User(name, email, phone);

		// Event type selection
		System.out.println("\nSelect Event Type:");
		System.out.println("1. Birthday Event");
		System.out.println("2. Conference Event");
		System.out.print("Enter choice: ");
		int eventType = sc.nextInt();
		sc.nextLine();

		// Common event details
		System.out.print("Enter Event Name: ");
		String eventName = sc.nextLine();

		System.out.print("Enter Location: ");
		String location = sc.nextLine();

		System.out.print("Enter Date (DD-MM-YYYY): ");
		String date = sc.nextLine();

		System.out.print("Enter Number of Attendees: ");
		int attendees = sc.nextInt();

		System.out.print("Enter Venue Cost: ");
		double venueCost = sc.nextDouble();

		System.out.print("Enter Service Cost (Catering/Decoration): ");
		double serviceCost = sc.nextDouble();

		// Switch for event creation
		switch (eventType) {
		case 1:
			event = new BirthdayEvent(eventName, location, date, attendees, organizer, venueCost, serviceCost);
			break;

		case 2:
			event = new ConferenceEvent(eventName, location, date, attendees, organizer, venueCost, serviceCost);
			break;

		default:
			System.out.println("Invalid Event Type. Exiting...");
			System.exit(0);
		}

		int choice;
		do {
			System.out.println("\n===== Event Menu =====");
			System.out.println("1. Schedule Event");
			System.out.println("2. Reschedule Event");
			System.out.println("3. Cancel Event");
			System.out.println("4. Show Event Details");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			// Switch for event operations
			switch (choice) {
			case 1:
				event.schedule();
				break;

			case 2:
				System.out.print("Enter New Date: ");
				String newDate = sc.nextLine();
				event.reschedule(newDate);
				break;

			case 3:
				event.cancel();
				break;

			case 4:
				event.showEventDetails();
				break;

			case 0:
				System.out.println("Thank you for using EventEase");
				break;

			default:
				System.out.println("Invalid option! Try again.");
			}

		} while (choice != 0);

		sc.close();
	}
}
