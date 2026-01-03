package com.mybankapplication;

//Base Account class
abstract class Account implements ITransaction {
	protected String accountNumber; // Accessible to subclasses
	private double balance; // Encapsulated

	// Constructor without opening balance
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	// Constructor with opening balance
	public Account(String accountNumber, double openingBalance) {
		this.accountNumber = accountNumber;
		this.balance = openingBalance;
	}

	// Deposit method
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("₹" + amount + " deposited successfully.");
		}
	}

	// Withdraw method
	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else {
			System.out.println("❌ Insufficient balance.");
		}
	}

	// Check balance
	@Override
	public double checkBalance() {
		return balance;
	}

	// Protected method for subclasses
	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	// Polymorphic method
	public abstract double calculateInterest();
}
