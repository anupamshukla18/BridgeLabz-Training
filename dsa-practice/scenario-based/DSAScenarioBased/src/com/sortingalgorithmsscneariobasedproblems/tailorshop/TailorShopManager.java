package com.sortingalgorithmsscneariobasedproblems.tailorshop;

public class TailorShopManager {

	// insertion sort logic for real-time order insertion
	public void insertOrder(Order[] orders, int size) {

		Order key = orders[size - 1];
		int j = size - 2;

		while (j >= 0 && orders[j].getDeadline() > key.getDeadline()) {
			orders[j + 1] = orders[j];
			j--;
		}

		orders[j + 1] = key;
	}

	public void displayOrders(Order[] orders, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(orders[i]);
		}
	}
}
