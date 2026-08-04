package day3.classproblems.linkedlist.circular;

public class CircularLinkedList {
	Node head;
	Node tail;
	int size;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	// Insertion at first
	public void insertFirst(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = tail = node;
			tail.next = head;
		} else {
			node.next = head;
			head = node;
			tail.next = head;
		}

		size++;
	}

	// Insertion at last
	public void insertLast(int val) {
		if (head == null) {
			insertFirst(val);
			return;
		}

		Node node = new Node(val);

		tail.next = node;
		tail = node;
		tail.next = head;

		size++;
	}

	// Insertion at a specific position
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

	// Deletion at first
	public int deleteFirst() {
		if (head == null)
			return -1;

		int val = head.value;

		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
		}

		size--;

		return val;
	}

	// Delete at last
	public int deleteLast() {
		if (head == null)
			return -1;

		if (head == tail)
			return deleteFirst();

		Node temp = head;

		while (temp.next != tail)
			temp = temp.next;

		int val = tail.value;

		tail = temp;
		tail.next = head;

		size--;

		return val;
	}

	// Deletion at a specific position
	public int deleteAtPosition(int index) {
		if (index == 0)
			return deleteFirst();

		if (index == size - 1)
			return deleteLast();

		Node temp = head;

		for (int i = 1; i < index; i++)
			temp = temp.next;

		int val = temp.next.value;

		temp.next = temp.next.next;

		size--;

		return val;
	}

	// Traversal of the list
	public void display() {
		if (head == null)
			return;

		Node temp = head;

		do {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(HEAD)");
	}

	// Reversal of the list
	public void reverse() {
		if (head == null || head.next == head)
			return;

		Node prev = tail;
		Node current = head;
		Node next;

		do {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		} while (current != head);

		tail = head;
		head = prev;
	}
}