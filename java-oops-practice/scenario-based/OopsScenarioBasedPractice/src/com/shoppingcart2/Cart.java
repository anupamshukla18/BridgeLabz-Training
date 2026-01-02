package com.shoppingcart2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	// List is used because Cart size is dynamic
	private List<Item> items;

	// Constructor initializes the ArrayList
	public Cart() {
		items = new ArrayList<>();
	}

	// Adds an item to the cart
	public void addItem(Item item) {
		items.add(item);
		System.out.println(item.getName() + " added to cart.");
	}

	// Calculates total price of all items in the cart
	public double calculateTotal() {
		double total = 0;

		// Loop through all items and add their total price
		for (Item item : items) {
			total += item.getTotalPrice();
		}

		return total;
	}

	// Displays all items present in the cart
	public void displayCart() {
		System.out.println("\nItems in Cart:");

		for (Item item : items) {
			System.out.println(item.getName() + " | Price: ₹" + item.getPrice() + " | Quantity: " + item.getQuantity());
		}
	}
}