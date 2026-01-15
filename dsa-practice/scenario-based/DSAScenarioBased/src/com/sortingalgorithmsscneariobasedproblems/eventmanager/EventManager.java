package com.sortingalgorithmsscneariobasedproblems.eventmanager;

import java.util.Scanner;

public class EventManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of tickets: ");
		int n = sc.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter the ticket prices: ");
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}

		int choice;

		do {
			System.out.println("\n===== EventManager Menu =====");
			System.out.println("1. Sort ticket prices (Quick Sort)");
			System.out.println("2. Show cheapest ticket");
			System.out.println("3. Show most expensive ticket");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				QuickSortUtil.quickSort(prices, 0, prices.length - 1);
				System.out.println("Ticket prices sorted successfully.");
				System.out.print("Sorted Prices: ");
				for (int price : prices) {
					System.out.print(price + " ");
				}
				System.out.println();
				break;

			case 2:
				QuickSortUtil.quickSort(prices, 0, prices.length - 1);
				System.out.println("Cheapest Ticket Price: " + prices[0]);
				break;

			case 3:
				QuickSortUtil.quickSort(prices, 0, prices.length - 1);
				System.out.println("Most Expensive Ticket Price: " + prices[prices.length - 1]);
				break;

			case 4:
				System.out.println("Exiting EventManager. Thank you!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 4);

		sc.close();
	}
}
