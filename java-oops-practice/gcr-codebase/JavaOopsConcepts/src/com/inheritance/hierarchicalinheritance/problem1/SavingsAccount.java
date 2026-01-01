package com.inheritance.hierarchicalinheritance.problem1;

public class SavingsAccount extends BankAccount {
	// Additional Attribute
	private double interestRate;

	// Parameterized Constructor
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	// Method to display account type
	void displayAccountType() {
		System.out.println("Account Type: Savings Account");
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}