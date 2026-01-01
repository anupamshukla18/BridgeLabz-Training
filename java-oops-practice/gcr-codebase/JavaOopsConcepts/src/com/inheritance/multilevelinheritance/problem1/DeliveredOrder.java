package com.inheritance.multilevelinheritance.problem1;

class DeliveredOrder extends ShippedOrder {
	// instance variables
	String deliveryDate;
	String receiverName;

	// constructor
	DeliveredOrder(int orderId, double amount, String shippingDate, String courierName, String deliveryDate,
			String receiverName) {

		super(orderId, amount, shippingDate, courierName); // Call ShippedOrder constructor
		this.deliveryDate = deliveryDate;
		this.receiverName = receiverName;
	}

	// overriding display method
	void displayInfo() {
		super.displayInfo();
		System.out.println("Delivery Date: " + deliveryDate);
		System.out.println("Received By: " + receiverName);
	}
}