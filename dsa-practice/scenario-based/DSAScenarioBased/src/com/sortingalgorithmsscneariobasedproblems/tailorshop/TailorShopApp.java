package com.sortingalgorithmsscneariobasedproblems.tailorshop;

public class TailorShopApp {

	public static void main(String[] args) {

		TailorShopManager manager = new TailorShopManager();

		Order[] orders = new Order[10];
		int size = 0;

		orders[size++] = new Order(101, 5);
		manager.insertOrder(orders, size);

		orders[size++] = new Order(102, 3);
		manager.insertOrder(orders, size);

		orders[size++] = new Order(103, 7);
		manager.insertOrder(orders, size);

		orders[size++] = new Order(104, 2);
		manager.insertOrder(orders, size);

		System.out.println("Orders Sorted by Delivery Deadline:");
		manager.displayOrders(orders, size);
	}
}
