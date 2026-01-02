package com.shoppingcart2;

public class ShoppingCartDriver {
	public static void main(String[] args) {
		// Create a customer
		Customer customer = new Customer("Rohan");

		// Create items (products)
		Item item1 = new Item(1, "Laptop", 55000, 1);
		Item item2 = new Item(2, "Mouse", 500, 2);
		Item item3 = new Item(3, "Keyboard", 1500, 1);

		// Add items to customer's cart
		customer.addToCart(item1);
		customer.addToCart(item2);
		customer.addToCart(item3);

		// Display cart items
		customer.viewCart();

		// Checkout and display total bill
		customer.checkout();
	}
}
