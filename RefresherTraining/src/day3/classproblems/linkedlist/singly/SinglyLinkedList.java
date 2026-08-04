package day3.classproblems.linkedlist.singly;

public class SinglyLinkedList {
	private Node head;
	private int size;

	public SinglyLinkedList() {
		size = 0;
	}

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Insert First
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		size++;
	}

	// Insert Last
	public void insertLast(int val) {
		if (head == null) {
			insertFirst(val);
			return;
		}

		Node temp = head;
		while (temp.next != null)
			temp = temp.next;

		temp.next = new Node(val);
		size++;
	}

	// Insert at a Position
	public void insertAtPosition(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		Node temp = head;

		for (int i = 1; i < index; i++)
			temp = temp.next;

		Node node = new Node(val);
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	// Delete First
	public int deleteFirst() {
		if (head == null)
			return -1;

		int val = head.value;
		head = head.next;
		size--;
		return val;
	}

	// Delete Last
	public int deleteLast() {
		if (head == null)
			return -1;

		if (head.next == null)
			return deleteFirst();

		Node secondLast = head;

		while (secondLast.next.next != null)
			secondLast = secondLast.next;

		int val = secondLast.next.value;
		secondLast.next = null;
		size--;

		return val;
	}

	// Delete at Position
	public int deleteAtPosition(int index) {
		if (index == 0)
			return deleteFirst();

		if (index == size - 1)
			return deleteLast();

		Node prev = head;

		for (int i = 1; i < index; i++)
			prev = prev.next;

		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;

		return val;
	}

	// Traversal
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}

		System.out.println("END");
	}

	// Reverse
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}
}