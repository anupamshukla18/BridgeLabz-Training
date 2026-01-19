package com.sortingalgorithmsscneariobasedproblems.flashdealz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of products: ");
		int n = sc.nextInt();

		Product[] products = new Product[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for Product " + (i + 1));

			System.out.print("Product ID: ");
			int id = sc.nextInt();

			System.out.print("Product Name: ");
			String name = sc.next();

			System.out.print("Discount (%): ");
			int discount = sc.nextInt();

			products[i] = new Product(id, name, discount);
		}

		FlashDealz.quickSort(products, 0, n - 1);

		System.out.println("\n🔥 Top Discounted Products:");
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ". " + products[i].name + " → " + products[i].discount + "% OFF");
		}

		sc.close();
	}
}
