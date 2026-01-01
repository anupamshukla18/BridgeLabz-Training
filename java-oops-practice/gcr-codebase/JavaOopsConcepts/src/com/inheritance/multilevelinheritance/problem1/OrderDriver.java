package com.inheritance.multilevelinheritance.problem1;

public class OrderDriver {
	public static void main(String[] args) {
		// Creating the object of delivered order
		DeliveredOrder order = new DeliveredOrder(101, 2500.50, "01-Jan-2026", "BlueDart", "04-Jan-2026",
				"Rahul Sharma");

		order.displayInfo();
	}
}