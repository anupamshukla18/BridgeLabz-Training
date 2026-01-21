package com.sortingalgorithmsscneariobasedproblems.tailorshop;

public class Order {

	private int orderId;
	private int deadline; // stored as days from today (smaller = earlier)

	public Order(int orderId, int deadline) {
		this.orderId = orderId;
		this.deadline = deadline;
	}

	public int getDeadline() {
		return deadline;
	}

	@Override
	public String toString() {
		return "Order ID: " + orderId + ", Deadline in " + deadline + " days";
	}
}
