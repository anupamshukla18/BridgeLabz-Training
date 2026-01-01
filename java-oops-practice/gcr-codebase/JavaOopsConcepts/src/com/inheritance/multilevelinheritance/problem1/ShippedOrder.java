package com.inheritance.multilevelinheritance.problem1;

class ShippedOrder extends Order {
	// instance variables
	String shippingDate;
	String courierName;

	// constructor
	ShippedOrder(int orderId, double amount, String shippingDate, String courierName) {
		super(orderId, amount); // calling Order constructor
		this.shippingDate = shippingDate;
		this.courierName = courierName;
	}

	// overriding the display method
	void displayInfo() {
		super.displayInfo();
		System.out.println("Shipping Date: " + shippingDate);
		System.out.println("Courier: " + courierName);
	}
}
