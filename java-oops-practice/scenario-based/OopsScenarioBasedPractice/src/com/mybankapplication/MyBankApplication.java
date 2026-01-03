package com.mybankapplication;

import java.util.Scanner;

public class MyBankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Savings Account Input
		System.out.print("Enter Savings Account Number: ");
		String sbNumber = sc.nextLine();

		System.out.print("Enter Savings Account Opening Balance: ");
		double sbBalance = sc.nextDouble();

		Account savings = new SavingsAccount(sbNumber, sbBalance);

		System.out.print("Enter amount to deposit in Savings: ");
		savings.deposit(sc.nextDouble());

		System.out.print("Enter amount to withdraw from Savings: ");
		savings.withdraw(sc.nextDouble());

		// Current Account Input
		sc.nextLine(); // consume newline

		System.out.print("\nEnter Current Account Number: ");
		String caNumber = sc.nextLine();

		System.out.print("Enter Current Account Opening Balance: ");
		double caBalance = sc.nextDouble();

		Account current = new CurrentAccount(caNumber, caBalance);

		System.out.print("Enter amount to deposit in Current: ");
		current.deposit(sc.nextDouble());

		System.out.print("Enter amount to withdraw from Current: ");
		current.withdraw(sc.nextDouble());

		// Final Output
		System.out.println("\n--- ACCOUNT SUMMARY ---");

		System.out.println("Savings Account Balance: ₹" + savings.checkBalance());
		System.out.println("Savings Account Interest: ₹" + savings.calculateInterest());

		System.out.println("\nCurrent Account Balance: ₹" + current.checkBalance());
		System.out.println("Current Account Interest: ₹" + current.calculateInterest());

		sc.close();
	}
}
