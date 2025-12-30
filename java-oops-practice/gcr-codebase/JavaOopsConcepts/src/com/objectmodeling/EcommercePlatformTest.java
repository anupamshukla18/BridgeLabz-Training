package com.objectmodeling;

import java.util.*;

//Product Class
class Product {
	private String productName;
	private double price;

	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
}

//Order Class (Aggregates Products)
class Order {

	private int orderId;
	private List<Product> products;

	public Order(int orderId) {
		this.orderId = orderId;
		products = new ArrayList<>();
	}

	public int getOrderId() {
		return orderId;
	}

	// add product into order
	public void addProduct(Product product) {
		products.add(product);
	}

	// calculate total amount
	public double calculateTotal() {
		double total = 0;
		for (Product p : products) {
			total += p.getPrice();
		}
		return total;
	}

	// show order details
	public void showOrderDetails() {
		System.out.println("\nOrder ID: " + orderId);
		System.out.println("Products in this order:");
		for (Product p : products) {
			System.out.println("- " + p.getProductName() + " | ₹" + p.getPrice());
		}
		System.out.println("Total Amount: ₹" + calculateTotal());
	}
}

//Buyer Class (Earlier Customer)
class Buyer {

	private String buyerName;
	private List<Order> myOrders;

	public Buyer(String buyerName) {
		this.buyerName = buyerName;
		myOrders = new ArrayList<>();
	}

	public String getBuyerName() {
		return buyerName;
	}

	// Buyer placing order (Association + Communication)
	public void placeOrder(Order order) {
		myOrders.add(order);
		System.out.println(buyerName + " placed Order ID: " + order.getOrderId());
	}

	// show all orders
	public void showMyOrders() {
		System.out.println("\nOrders placed by " + buyerName + ":");
		for (Order o : myOrders) {
			System.out.println("- Order ID: " + o.getOrderId());
		}
	}
}

//Main Class
public class EcommercePlatformTest {
	public static void main(String[] args) {

		// create products
		Product p1 = new Product("Laptop", 55000);
		Product p2 = new Product("Headphones", 2500);
		Product p3 = new Product("Smartphone", 32000);

		// create buyer
		Buyer buyer = new Buyer("Rohan");

		// create orders
		Order order1 = new Order(101);
		Order order2 = new Order(102);

		// add products to orders (Aggregation)
		order1.addProduct(p1);
		order1.addProduct(p2);

		order2.addProduct(p3);

		// buyer places orders (Communication)
		buyer.placeOrder(order1);
		buyer.placeOrder(order2);

		// show info
		buyer.showMyOrders();
		order1.showOrderDetails();
		order2.showOrderDetails();
	}
}
