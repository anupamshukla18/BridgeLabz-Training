package com.foodloopresturantorderingsystem;

import java.util.ArrayList;

class Order implements IOrderable {
	private ArrayList<FoodItem> items = new ArrayList<>();
	private double total;

	// Constructor for combo meal
	public Order(FoodItem... foodItems) {
		for (FoodItem item : foodItems) {
			addItem(item);
		}
	}

	public Order() {
	}

	public void addItem(FoodItem item) {
		if (item.isAvailable()) {
			items.add(item);
			total += item.getPrice(); // operator usage
			item.reduceStock();
		} else {
			System.out.println(item.getName() + " is out of stock!");
		}
	}

	// Polymorphic discount logic
	public double applyDiscount() {
		if (total > 1000)
			return total * 0.20;
		else if (total > 500)
			return total * 0.10;
		return 0;
	}

	@Override
	public void placeOrder() {
		double discount = applyDiscount();
		total -= discount; // operator usage

		System.out.println("Order placed successfully!");
		System.out.println("Discount Applied: ₹" + discount);
		System.out.println("Final Amount: ₹" + total);
	}

	@Override
	public void cancelOrder() {
		items.clear();
		total = 0;
		System.out.println("Order cancelled.");
	}
}
