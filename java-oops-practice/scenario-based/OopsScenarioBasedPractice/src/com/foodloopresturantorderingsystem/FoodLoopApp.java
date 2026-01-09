package com.foodloopresturantorderingsystem;

import java.util.Scanner;

public class FoodLoopApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FoodItem burger = new NonVegItem("Chicken Burger", 250, 5);
		FoodItem pizza = new VegItem("Veg Pizza", 300, 5);
		FoodItem biryani = new NonVegItem("Biryani", 400, 3);

		Order order = new Order();

		int choice;
		do {
			System.out.println("\n===== FOODLOOP MENU =====");
			System.out.println("1. Add Chicken Burger");
			System.out.println("2. Add Veg Pizza");
			System.out.println("3. Add Biryani");
			System.out.println("4. Place Order");
			System.out.println("5. Cancel Order");
			System.out.println("6. Exit");
			System.out.print("Choose: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				order.addItem(burger);
				break;
			case 2:
				order.addItem(pizza);
				break;
			case 3:
				order.addItem(biryani);
				break;
			case 4:
				order.placeOrder();
				break;
			case 5:
				order.cancelOrder();
				break;
			case 6:
				System.out.println("Thank you for using FoodLoop");
				break;
			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 6);

		sc.close();
	}
}
