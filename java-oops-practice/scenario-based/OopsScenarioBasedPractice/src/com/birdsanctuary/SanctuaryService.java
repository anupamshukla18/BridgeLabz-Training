package com.birdsanctuary;

import java.util.*;

// This class contains all business logic
public class SanctuaryService {

	// List to store all birds
	private static ArrayList<Bird> birds = new ArrayList<>();

	// Scanner for user input
	private static Scanner sc = new Scanner(System.in);

	// Read annotation data using reflection
	public static void showDeveloperInfo() {
		Class<Bird> cls = Bird.class;

		if (cls.isAnnotationPresent(DeveloperInfo.class)) {
			DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
			System.out.println("Developer: " + info.developerName());
			System.out.println("Version: " + info.version());
		}
	}

	// Add new bird
	public static void addBird() {

		System.out.println("1. Eagle  2. Duck  3. Penguin  4. Kiwi");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter name: ");
		String name = sc.nextLine();

		System.out.print("Enter ID: ");
		String id = sc.nextLine();

		Bird bird = null;

		// Create object based on choice
		switch (choice) {
		case 1 -> bird = new Eagle(name, id);
		case 2 -> bird = new Duck(name, id);
		case 3 -> bird = new Penguin(name, id);
		case 4 -> bird = new Kiwi(name, id);
		}

		if (bird != null) {
			birds.add(bird);
			System.out.println("Bird added successfully.");
		}
	}

	// Display all birds
	public static void displayAll() {
		for (Bird b : birds) {
			b.displayInfo();
			b.eat();

			// Polymorphism using interface
			if (b instanceof Flyable f)
				f.fly();
			if (b instanceof Swimmable s)
				s.swim();
		}
	}

	// Display only flying birds
	public static void displayFlying() {
		for (Bird b : birds)
			if (b instanceof Flyable f) {
				b.displayInfo();
				f.fly();
			}
	}

	// Display only swimming birds
	public static void displaySwimming() {
		for (Bird b : birds)
			if (b instanceof Swimmable s) {
				b.displayInfo();
				s.swim();
			}
	}

	// Display birds that can fly and swim
	public static void displayBoth() {
		for (Bird b : birds)
			if (b instanceof Flyable && b instanceof Swimmable)
				b.displayInfo();
	}

	// Delete bird using ID
	public static void deleteBird() {
		System.out.print("Enter ID: ");
		String id = sc.nextLine();

		Iterator<Bird> it = birds.iterator();
		while (it.hasNext()) {
			if (it.next().getId().equals(id)) {
				it.remove();
				System.out.println("Bird removed.");
				return;
			}
		}
		System.out.println("Bird not found.");
	}

	// Report of bird abilities
	public static void report() {
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird b : birds) {
			boolean f = b instanceof Flyable;
			boolean s = b instanceof Swimmable;

			if (f && s)
				both++;
			else if (f)
				fly++;
			else if (s)
				swim++;
			else
				neither++;
		}

		System.out.println("Flying: " + fly);
		System.out.println("Swimming: " + swim);
		System.out.println("Both: " + both);
		System.out.println("Neither: " + neither);
	}
}
