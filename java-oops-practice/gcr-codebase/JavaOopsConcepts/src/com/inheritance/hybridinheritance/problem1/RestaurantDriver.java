package com.inheritance.hybridinheritance.problem1;

public class RestaurantDriver {
	public static void main(String[] args) {
		Worker chef = new Chef("Ramesh", 101);
		Worker waiter = new Waiter("Sohan", 102);

		chef.performDuties();
		waiter.performDuties();
	}
}