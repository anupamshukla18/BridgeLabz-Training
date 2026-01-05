package com.linkedlist.singly.inventorymanagement;

import java.util.*;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InventoryLinkedList inventory = new InventoryLinkedList();
		int choice;

		do {
			System.out.println("\n=== Inventory Management ===");
			System.out.println("1. Add at Beginning");
			System.out.println("2. Add at End");
			System.out.println("3. Add at Position");
			System.out.println("4. Remove Item by ID");
			System.out.println("5. Update Quantity");
			System.out.println("6. Search by ID");
			System.out.println("7. Search by Name");
			System.out.println("8. Total Inventory Value");
			System.out.println("9. Sort by Price");
			System.out.println("10. Display All");
			System.out.println("11. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();

			int id, qty, pos;
			double price;
			String name;

			switch (choice) {
			case 1:
			case 2:
			case 3:
				if (choice == 3) {
					System.out.print("Position: ");
					pos = sc.nextInt();
				} else
					pos = 0;

				System.out.print("Item ID: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Item Name: ");
				name = sc.nextLine();
				System.out.print("Quantity: ");
				qty = sc.nextInt();
				System.out.print("Price: ");
				price = sc.nextDouble();

				if (choice == 1)
					inventory.addAtBeginning(id, name, qty, price);
				else if (choice == 2)
					inventory.addAtEnd(id, name, qty, price);
				else
					inventory.addAtPosition(pos, id, name, qty, price);
				break;

			case 4:
				System.out.print("Item ID: ");
				inventory.removeById(sc.nextInt());
				break;

			case 5:
				System.out.print("Item ID: ");
				id = sc.nextInt();
				System.out.print("New Quantity: ");
				qty = sc.nextInt();
				inventory.updateQuantity(id, qty);
				break;

			case 6:
				System.out.print("Item ID: ");
				inventory.searchById(sc.nextInt());
				break;

			case 7:
				sc.nextLine();
				System.out.print("Item Name: ");
				inventory.searchByName(sc.nextLine());
				break;

			case 8:
				inventory.totalInventoryValue();
				break;

			case 9:
				System.out.print("1. Ascending  2. Descending: ");
				inventory.sortByPrice(sc.nextInt() == 1);
				break;

			case 10:
				inventory.displayAll();
				break;

			case 11:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 11);

		sc.close();
	}

}
