package com.oopspillars.bankingsystem;

import java.util.*;

public class BankingApplication {
	public static void main(String[] args) {

		// Polymorphic list
		List<BankAccount> accounts = new ArrayList<>();

		accounts.add(new SavingsAccount("SAV101", "Anupam", 80000));
		accounts.add(new CurrentAccount("CUR202", "Anuj", 150000));

		// Runtime polymorphism
		for (BankAccount acc : accounts) {

			System.out.println("\nAccount Holder: " + acc.getHolderName());
			System.out.println("Account Number: " + acc.getAccountNumber());
			System.out.println("Balance: ₹" + acc.getBalance());

			// Dynamic method binding
			double interest = acc.calculateInterest();
			System.out.println("Calculated Interest: ₹" + interest);

			// Loan processing using interface
			if (acc instanceof Loanable) {
				Loanable loanAcc = (Loanable) acc;

				if (loanAcc.calculateLoanEligibility()) {
					loanAcc.applyForLoan(50000);
				} else {
					System.out.println("Not eligible for loan.");
				}
			}
			System.out.println("--------------------------------");
		}
	}
}
