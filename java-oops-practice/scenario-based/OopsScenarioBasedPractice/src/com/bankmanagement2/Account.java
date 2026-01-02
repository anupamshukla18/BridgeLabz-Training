package com.bankmanagement2;

public class Account {
	//instance variables
	protected double balance;

	//constructor
	public Account(double balance) {
		this.balance = balance;
	}

	//deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful. Balance: ₹" + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	//withdraw method
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal Successful. Balance: ₹" + balance);
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	//getBalance method
	public double getBalance() {
		return balance;
	}
}