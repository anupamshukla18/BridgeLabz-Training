package com.payxpress;

import java.time.LocalDate;
import java.util.Scanner;

// Main class with menu
public class PayXpressApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bill bill = null;
		int choice;

		do {
			System.out.println("\n--- PAYXPRESS MENU ---");
			System.out.println("1. Create Electricity Bill");
			System.out.println("2. Create Internet Bill");
			System.out.println("3. Create Water Bill");
			System.out.println("4. Send Reminder");
			System.out.println("5. Pay Bill");
			System.out.println("6. Calculate Late Fee");
			System.out.println("7. Check Payment Status");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter amount: ");
				double eAmount = sc.nextDouble();
				bill = new ElectricityBill(eAmount, LocalDate.now().plusDays(5));
				System.out.println("Electricity bill created.");
				break;

			case 2:
				System.out.print("Enter amount: ");
				double iAmount = sc.nextDouble();
				bill = new InternetBill(iAmount);
				System.out.println("Internet bill created.");
				break;

			case 3:
				System.out.print("Enter amount: ");
				double wAmount = sc.nextDouble();
				bill = new WaterBill(wAmount, LocalDate.now().plusDays(3));
				System.out.println("Water bill created.");
				break;

			case 4:
				if (bill != null)
					bill.sendReminder();
				else
					System.out.println("No bill created yet.");
				break;

			case 5:
				if (bill != null)
					bill.pay();
				else
					System.out.println("No bill created yet.");
				break;

			case 6:
				if (bill != null) {
					System.out.print("Enter penalty amount: ");
					double penalty = sc.nextDouble();
					System.out.println("Total amount: " + bill.calculateLateFee(penalty));
				} else {
					System.out.println("No bill created yet.");
				}
				break;

			case 7:
				if (bill != null)
					System.out.println("Bill paid: " + bill.isPaid());
				else
					System.out.println("No bill created yet.");
				break;

			case 8:
				System.out.println("Thank you for using PayXpress.");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 8);

		sc.close();
	}
}
