package com.bankmanagement2;

public class SavingsAccount extends Account {
	// instance variables
	private double interestRate;

	// constructor
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	// calculateInterest method
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;

		System.out.println("Interest Added: ₹" + interest);
		System.out.println("Updated Balance: ₹" + balance);
	}
}