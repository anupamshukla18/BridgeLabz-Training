package com.shoppingcart;

import java.util.ArrayList;
import java.util.List;

// Cart class represents a shopping cart containing multiple items
public class Cart {
	// List of items (HAS-A relationship)
	private List<Item> items;

	// Constructor initializes the item list
	public Cart() {
		items = new ArrayList<>();
	}

	// Method to add an item to the cart
	public void addItem(Item item) {
		items.add(item);
		System.out.println(item.getItemName() + " added to cart.");
	}

	// Method to calculate total cart amount
	public double calculateTotal() {
		double total = 0;

		for (Item item : items) {
			total += item.getTotalPrice();
		}

		return total;
	}

	// Method to display cart items
	public void showCart() {
		System.out.println("\nItems in Cart:");
		for (Item item : items) {
			System.out.println(item.getItemName() + " | Price: ₹" + item.getPrice() + " | Qty: " + item.getQuantity());
		}
	}
}