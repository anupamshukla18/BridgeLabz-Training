package com.bankmanagement2;

public class Customer {
	// instance variables
	private String customerName;
	private Account account;

	// constructor
	public Customer(String customerName, Account account) {
		this.customerName = customerName;
		this.account = account;
	}

	// depositMoney method
	public void depositMoney(double amount) {
		account.deposit(amount);
	}

	// withdrawMoney method
	public void withdrawMoney(double amount) {
		account.withdraw(amount);
	}

	// show balance method
	public void showBalance() {
		System.out.println(customerName + "'s Balance: ₹" + account.getBalance());
	}
}