package com.inheritance.multilevelinheritance.problem1;

class Order {
	// instance variables
	int orderId;
	double amount;

	// constructors
	Order(int orderId, double amount) {
		this.orderId = orderId;
		this.amount = amount;
	}

	// display method
	void displayInfo() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Amount: ₹" + amount);
	}
}
