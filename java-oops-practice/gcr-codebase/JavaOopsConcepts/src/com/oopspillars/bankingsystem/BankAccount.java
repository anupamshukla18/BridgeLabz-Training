package com.oopspillars.bankingsystem;

public abstract class BankAccount {
	// Encapsulated fields
	private String accountNumber;
	private String holderName;
	protected double balance; // protected so subclasses can access

	// Constructor
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Concrete method: deposit
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("₹" + amount + " deposited successfully.");
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	// Concrete method: withdraw
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("₹" + amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Abstract method: interest calculation
	public abstract double calculateInterest();

	// Encapsulation via getters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}
}
