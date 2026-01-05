package com.groceryshoppingapplication;

class PerishableProduct extends Product {
	public PerishableProduct(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	@Override
	public double getDiscount() {
		return getTotalPrice() * 0.10; // 10% discount
	}
}
