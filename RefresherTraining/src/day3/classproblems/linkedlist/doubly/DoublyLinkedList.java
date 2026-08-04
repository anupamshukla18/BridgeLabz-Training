package day3.classproblems.linkedlist.doubly;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size;

	class Node {

		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	// Inserting at First
	public void insertFirst(int val) {
		Node node = new Node(val);

		node.next = head;

		if (head != null)
			head.prev = node;

		head = node;

		if (tail == null)
			tail = head;

		size++;
	}

	// Inserting at Last
	public void insertLast(int val) {
		if (head == null) {
			insertFirst(val);
			return;
		}

		Node node = new Node(val);

		tail.next = node;
		node.prev = tail;
		tail = node;

		size++;
	}

	// Inserting at a Specific Position
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
		node.prev = temp;

		temp.next.prev = node;
		temp.next = node;

		size++;
	}

	// Deleting at First
	public int deleteFirst() {
		if (head == null)
			return -1;

		int val = head.value;

		head = head.next;

		if (head != null)
			head.prev = null;
		else
			tail = null;

		size--;

		return val;
	}

	// Deleting at Last
	public int deleteLast() {
		if (head == null)
			return -1;

		if (head.next == null)
			return deleteFirst();

		int val = tail.value;

		tail = tail.prev;
		tail.next = null;

		size--;

		return val;
	}

	// Deleting at a Specific Position
	public int deleteAtPosition(int index) {
		if (index == 0)
			return deleteFirst();

		if (index == size - 1)
			return deleteLast();

		Node temp = head;

		for (int i = 0; i < index; i++)
			temp = temp.next;

		int val = temp.value;

		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;

		size--;

		return val;
	}

	// Traversal of the list
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " <-> ");
			temp = temp.next;
		}

		System.out.println("END");
	}

	// Reversal of the list
	public void reverse() {
		Node current = head;
		Node temp = null;

		while (current != null) {

			temp = current.prev;
			current.prev = current.next;
			current.next = temp;

			current = current.prev;
		}

		if (temp != null)
			head = temp.prev;
	}
}