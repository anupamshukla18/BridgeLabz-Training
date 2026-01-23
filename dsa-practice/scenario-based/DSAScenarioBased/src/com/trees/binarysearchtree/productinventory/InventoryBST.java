package com.trees.binarysearchtree.productinventory;

import java.util.Scanner;

public class InventoryBST {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductBST bst = new ProductBST();

		System.out.print("Enter number of products: ");
		int n = sc.nextInt();

		// User Input
		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter SKU: ");
			int sku = sc.nextInt();

			System.out.print("Enter Product Name: ");
			String name = sc.next();

			System.out.print("Enter Price: ");
			double price = sc.nextDouble();

			bst.root = bst.insert(bst.root, new Product(sku, name, price));
		}

		// 🔹 Scenario 1: Lookup
		System.out.print("\nEnter SKU to search: ");
		int searchSku = sc.nextInt();
		Node found = bst.search(bst.root, searchSku);

		if (found != null)
			System.out.println("Found: " + found.product.name + " | ₹" + found.product.price);
		else
			System.out.println("Product not found");

		// 🔹 Scenario 2: Price Update
		System.out.print("\nEnter SKU to update price: ");
		int updateSku = sc.nextInt();
		Node updateNode = bst.search(bst.root, updateSku);

		if (updateNode != null) {
			System.out.print("Enter new price: ");
			updateNode.product.price = sc.nextDouble();
		}

		// 🔹 Scenario 3: Sorted Display
		System.out.println("\nProducts in Sorted SKU Order:");
		bst.inorder(bst.root);

		sc.close();
	}
}