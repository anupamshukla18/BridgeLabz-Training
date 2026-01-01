package com.inheritance.hierarchicalinheritance.problem1;

public class CheckingAccount extends BankAccount {
	// Additional Attribute
	private double withdrawalLimit;

	// Parameterized Constructor
	public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	// Method to display account type
	void displayAccountType() {
		System.out.println("Account Type: Checking Account");
		System.out.println("Withdrawal Limit: " + withdrawalLimit);
	}
}