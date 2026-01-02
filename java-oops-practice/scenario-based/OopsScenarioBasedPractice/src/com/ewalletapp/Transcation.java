package com.ewalletapp;

class Transaction {
	private String description;
	private double amount;

	public Transaction(String description, double amount) {
		this.description = description;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return description + " : ₹" + amount;
	}
}
