package com.mybankapplication;

import java.util.Scanner;

public class MyBankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		// Account creation using switch
		System.out.println("Select Account Type:");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		System.out.print("Enter choice: ");
		int type = sc.nextInt();

		sc.nextLine(); // consume newline

		System.out.print("Enter Account Number: ");
		String accNumber = sc.nextLine();

		System.out.print("Enter Opening Balance: ");
		double balance = sc.nextDouble();

		switch (type) {
		case 1:
			account = new SavingsAccount(accNumber, balance);
			break;
		case 2:
			account = new CurrentAccount(accNumber, balance);
			break;
		default:
			System.out.println(""
					+ "Invalid Account Type!");
			System.exit(0);
		}

		int choice;
		do {
			System.out.println("\n--- BANK MENU ---");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Calculate Interest");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter deposit amount: ");
				account.deposit(sc.nextDouble());
				break;

			case 2:
				System.out.print("Enter withdrawal amount: ");
				account.withdraw(sc.nextDouble());
				break;

			case 3:
				System.out.println("Current Balance: " + account.checkBalance());
				break;

			case 4:
				System.out.println("Interest Earned: " + account.calculateInterest());
				break;

			case 5:
				System.out.println("Thank you for using MyBank!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		sc.close();
	}
}
