package day3.classproblems.linkedlist.doubly;

public class DoublyMain {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		// Insertions
		list.insertFirst(30);
		list.insertFirst(20);
		list.insertFirst(10);

		list.insertLast(40);
		list.insertLast(50);

		list.insertAtPosition(25, 2);

		System.out.println("Original List:");
		list.display();

		// Deletions
		System.out.println("\nDeleted First : " + list.deleteFirst());
		list.display();

		System.out.println("\nDeleted Last : " + list.deleteLast());
		list.display();

		System.out.println("\nDeleted Position 2 : " + list.deleteAtPosition(2));
		list.display();

		// Reversal of the list
		System.out.println("\nReversed List:");
		list.reverse();
		list.display();
	}
}