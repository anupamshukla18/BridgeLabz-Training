package com.shoppingcart2;

public class Customer {
	private String customerName;
	private Cart cart; // HAS-A relationship

	// Constructor initializes customer and creates a new cart
	public Customer(String customerName) {
		this.customerName = customerName;
		this.cart = new Cart();
	}

	// Customer adds an item to the cart
	public void addToCart(Item item) {
		cart.addItem(item);
	}

	// Customer views cart contents
	public void viewCart() {
		cart.displayCart();
	}

	// Customer checks out and sees total bill
	public void checkout() {
		double totalAmount = cart.calculateTotal();
		System.out.println("\n" + customerName + "'s Total Bill: ₹" + totalAmount);
	}
}