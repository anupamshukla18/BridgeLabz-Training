package com.linkedlist.singly.inventorymanagement;

class InventoryLinkedList {
	private ItemNode head;

	// Add at beginning
	public void addAtBeginning(int id, String name, int qty, double price) {
		ItemNode newNode = new ItemNode(id, name, qty, price);
		newNode.next = head;
		head = newNode;
		System.out.println("Item added at beginning.");
	}

	// Add at end
	public void addAtEnd(int id, String name, int qty, double price) {
		ItemNode newNode = new ItemNode(id, name, qty, price);

		if (head == null) {
			head = newNode;
			System.out.println("Item added as first record.");
			return;
		}

		ItemNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Item added at end.");
	}

	// Add at position
	public void addAtPosition(int pos, int id, String name, int qty, double price) {
		if (pos <= 0) {
			System.out.println("Invalid position.");
			return;
		}

		if (pos == 1) {
			addAtBeginning(id, name, qty, price);
			return;
		}

		ItemNode newNode = new ItemNode(id, name, qty, price);
		ItemNode temp = head;

		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Position out of range.");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Item added at position " + pos);
	}

	// Remove by ID
	public void removeById(int id) {
		if (head == null) {
			System.out.println("Inventory empty.");
			return;
		}

		if (head.itemId == id) {
			head = head.next;
			System.out.println("Item removed.");
			return;
		}

		ItemNode temp = head;
		while (temp.next != null && temp.next.itemId != id) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Item not found.");
		} else {
			temp.next = temp.next.next;
			System.out.println("Item removed.");
		}
	}

	// Update quantity
	public void updateQuantity(int id, int newQty) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				temp.quantity = newQty;
				System.out.println("Quantity updated.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found.");
	}

	// Search by ID
	public void searchById(int id) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				displayItem(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found.");
	}

	// Search by Name
	public void searchByName(String name) {
		ItemNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.itemName.equalsIgnoreCase(name)) {
				displayItem(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("Item not found.");
		}
	}

	// Total inventory value
	public void totalInventoryValue() {
		double total = 0;
		ItemNode temp = head;

		while (temp != null) {
			total += temp.quantity * temp.price;
			temp = temp.next;
		}
		System.out.println("Total Inventory Value: ₹" + total);
	}

	// Display inventory
	public void displayAll() {
		if (head == null) {
			System.out.println("Inventory empty.");
			return;
		}

		ItemNode temp = head;
		System.out.println("\n----- Inventory -----");
		while (temp != null) {
			displayItem(temp);
			temp = temp.next;
		}
	}

	private void displayItem(ItemNode item) {
		System.out.println("ID: " + item.itemId + ", Name: " + item.itemName + ", Qty: " + item.quantity + ", Price: ₹"
				+ item.price);
	}

	// sort by price
	public void sortByPrice(boolean ascending) {
		head = mergeSortByPrice(head, ascending);
		System.out.println("Inventory sorted by price.");
	}

	private ItemNode mergeSortByPrice(ItemNode node, boolean asc) {
		if (node == null || node.next == null)
			return node;

		ItemNode middle = getMiddle(node);
		ItemNode nextOfMiddle = middle.next;
		middle.next = null;

		ItemNode left = mergeSortByPrice(node, asc);
		ItemNode right = mergeSortByPrice(nextOfMiddle, asc);

		return sortedMergeByPrice(left, right, asc);
	}

	private ItemNode sortedMergeByPrice(ItemNode a, ItemNode b, boolean asc) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		boolean condition = asc ? a.price <= b.price : a.price > b.price;

		if (condition) {
			a.next = sortedMergeByPrice(a.next, b, asc);
			return a;
		} else {
			b.next = sortedMergeByPrice(a, b.next, asc);
			return b;
		}
	}

	private ItemNode getMiddle(ItemNode node) {
		ItemNode slow = node, fast = node.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
