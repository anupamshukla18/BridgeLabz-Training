package com.shoppingcart;

public class ShoppingCartDriver {
	public static void main(String[] args) {
		// Create customer
		Customer customer = new Customer("Rohan");

		// Create items
		Item item1 = new Item(101, "Laptop", 55000, 1);
		Item item2 = new Item(102, "Mouse", 500, 2);
		Item item3 = new Item(103, "Keyboard", 1500, 1);

		// Add items to cart
		customer.addItemToCart(item1);
		customer.addItemToCart(item2);
		customer.addItemToCart(item3);

		// View cart
		customer.viewCart();

		// Checkout
		customer.checkout();
	}
}
