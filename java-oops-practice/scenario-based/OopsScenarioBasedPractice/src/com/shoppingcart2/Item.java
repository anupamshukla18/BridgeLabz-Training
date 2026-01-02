package com.shoppingcart2;

public class Item {
	// Private variables to follow encapsulation
	private int itemId;
	private String name;
	private double price;
	private int quantity;

	// Constructor to initialize item details
	public Item(int itemId, String name, double price, int quantity) {
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Method to calculate total price of this item
	public double getTotalPrice() {
		return price * quantity;
	}

	// Getter methods (no setters to keep item immutable for now)
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}