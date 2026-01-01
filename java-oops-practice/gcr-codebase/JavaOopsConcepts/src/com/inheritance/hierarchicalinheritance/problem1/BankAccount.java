package com.inheritance.hierarchicalinheritance.problem1;

public class BankAccount {

	// Attributes
	protected int accountNumber;
	protected double balance;

	// Parameterized Constructor
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Method to display common account details
	void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}