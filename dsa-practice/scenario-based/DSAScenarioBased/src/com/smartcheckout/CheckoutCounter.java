package com.smartcheckout;

import java.util.*;

// Manages customer queue and billing
class CheckoutCounter {

	Queue<Customer> queue = new LinkedList<>();
	Store store;

	CheckoutCounter(Store store) {
		this.store = store;
	}

	void addCustomer(Customer c) {
		queue.add(c);
		System.out.println("Customer added: " + c.name);
	}

	void processCustomer() {
		if (queue.isEmpty()) {
			System.out.println("No customers in queue");
			return;
		}

		Customer c = queue.remove();
		int total = 0;

		System.out.println("\nBilling for: " + c.name);

		for (String item : c.items) {

			if (!store.stockMap.containsKey(item)) {
				System.out.println(item + " - Item not found");
				continue;
			}

			int stock = store.stockMap.get(item);

			if (stock > 0) {
				int price = store.priceMap.get(item);
				total += price;
				store.stockMap.put(item, stock - 1);
				System.out.println(item + " - ₹" + price);
			} else {
				System.out.println(item + " - Out of stock");
			}
		}

		System.out.println("Total Amount: ₹" + total);
	}
}