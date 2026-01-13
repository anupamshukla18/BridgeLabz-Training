package com.budgetwise;

// Represents one income or expense
class Transaction {
	private double amount;
	private String type; // income or expense
	private String date;
	private String category;

	Transaction(double amount, String type, String date, String category) {
		this.amount = amount;
		this.type = type;
		this.date = date;
		this.category = category;
	}

	double getAmount() {
		return amount;
	}

	String getType() {
		return type;
	}

	String getCategory() {
		return category;
	}
}
