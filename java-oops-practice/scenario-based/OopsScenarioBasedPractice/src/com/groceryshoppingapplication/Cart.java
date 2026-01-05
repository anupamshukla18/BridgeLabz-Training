package com.groceryshoppingapplication;

import java.util.*;

class Cart implements ICheckout {
	private List<Product> products; // Encapsulation
	private double totalPrice;

	// Constructor without items
	public Cart() {
		products = new ArrayList<>();
	}

	// Constructor with items
	public Cart(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		products.add(product);
		calculateTotal();
	}

	private void calculateTotal() {
		totalPrice = 0;
		for (Product p : products) {
			totalPrice += p.getTotalPrice();
		}
	}

	@Override
	public void applyDiscount() {
		double discount = 0;
		for (Product p : products) {
			discount += p.getDiscount(); // polymorphism
		}
		totalPrice -= discount;
		System.out.println("Discount Applied: ₹" + discount);
	}

	@Override
	public void generateBill() {
		System.out.println("\n========= SWIFTCART BILL =========");
		for (Product p : products) {
			p.display();
		}
		System.out.println("Total Payable Amount: ₹" + totalPrice);
	}
}
