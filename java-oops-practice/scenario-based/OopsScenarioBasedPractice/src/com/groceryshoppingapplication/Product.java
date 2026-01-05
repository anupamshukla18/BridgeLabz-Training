package com.groceryshoppingapplication;

abstract class Product {
	protected String name;
	protected double price;
	protected int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return price * quantity; // operator usage
	}

	// Polymorphic method
	public abstract double getDiscount();

	public void display() {
		System.out.println(name + " | Price: ₹" + price + " | Qty: " + quantity);
	}
}
