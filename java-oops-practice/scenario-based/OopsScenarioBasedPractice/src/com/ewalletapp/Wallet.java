package com.ewalletapp;

import java.util.ArrayList;
import java.util.List;

abstract class Wallet implements Transferrable {
	// Encapsulation: balance is private
	private double balance;

	protected List<Transaction> transactions = new ArrayList<>();

	// Constructor without referral bonus
	public Wallet() {
		this.balance = 0;
	}

	// Constructor with referral bonus
	public Wallet(double referralBonus) {
		this.balance = referralBonus;
		transactions.add(new Transaction("Referral Bonus", referralBonus));
	}

	// Controlled access to balance
	public double getBalance() {
		return balance;
	}

	// Load money into wallet
	public void loadMoney(double amount) {
		balance += amount;
		transactions.add(new Transaction("Money Loaded", amount));
	}

	// Protected method for subclasses to update balance
	protected void deductBalance(double amount) {
		balance -= amount;
	}

	// View transaction history
	public void viewTransactions() {
		for (Transaction t : transactions) {
			System.out.println(t);
		}
	}
}
