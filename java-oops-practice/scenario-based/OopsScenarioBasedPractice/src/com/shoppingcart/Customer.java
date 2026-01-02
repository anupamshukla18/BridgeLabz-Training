package com.shoppingcart;

public class Customer {
	private String customerName;
	private Cart cart;

	// Constructor initializes customer and assigns a cart
	public Customer(String customerName) {
		this.customerName = customerName;
		this.cart = new Cart();
	}

	// Customer adds item to cart
	public void addItemToCart(Item item) {
		cart.addItem(item);
	}

	// Customer views cart
	public void viewCart() {
		cart.showCart();
	}

	// Customer checks total bill
	public void checkout() {
		double totalAmount = cart.calculateTotal();
		System.out.println("\n" + customerName + "'s Total Bill: ₹" + totalAmount);
	}
}