package com.shoppingcart;

public class Item {
	private String itemName;
	private double price;
	private int quantity;

	// Constructor to initialize item details
	public Item(int itemId, String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// Method to calculate total price of this item
	public double getTotalPrice() {
		return price * quantity;
	}

	// Getter methods
	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
}