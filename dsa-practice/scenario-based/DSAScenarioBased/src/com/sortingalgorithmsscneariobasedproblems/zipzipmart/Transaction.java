package com.sortingalgorithmsscneariobasedproblems.zipzipmart;

// Represents a single sales transaction
class Transaction {
	String date; // Format: YYYY-MM-DD
	double amount;
	String branchName;

	// Constructor
	Transaction(String date, double amount, String branchName) {
		this.date = date;
		this.amount = amount;
		this.branchName = branchName;
	}

	// Display transaction details
	void display() {
		System.out.println(date + " | ₹" + amount + " | " + branchName);
	}
}
