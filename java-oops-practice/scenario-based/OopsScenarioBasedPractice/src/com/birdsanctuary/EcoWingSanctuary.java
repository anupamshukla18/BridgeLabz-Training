package com.birdsanctuary;

// Main driver class
public class EcoWingSanctuary {

	public static void main(String[] args) {

		// Show developer info
		SanctuaryService.showDeveloperInfo();

		while (true) {
			System.out.println("\n--- ECO WING BIRD SANCTUARY ---");
			System.out.println("1. Add Bird");
			System.out.println("2. Display All Birds");
			System.out.println("3. Display Flying Birds");
			System.out.println("4. Display Swimming Birds");
			System.out.println("5. Display Both Flying & Swimming Birds");
			System.out.println("6. Delete Bird by ID");
			System.out.println("7. Sanctuary Report");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			int choice = new java.util.Scanner(System.in).nextInt();

			// Call service methods
			switch (choice) {
			case 1 -> SanctuaryService.addBird();
			case 2 -> SanctuaryService.displayAll();
			case 3 -> SanctuaryService.displayFlying();
			case 4 -> SanctuaryService.displaySwimming();
			case 5 -> SanctuaryService.displayBoth();
			case 6 -> SanctuaryService.deleteBird();
			case 7 -> SanctuaryService.report();
			case 8 -> System.exit(0);
			default -> System.out.println("Invalid choice");
			}
		}
	}
}
