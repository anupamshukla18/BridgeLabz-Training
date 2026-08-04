package day3.hackerrankproblems.linkedlist;

import java.util.Scanner;

public class PrintingLinkedList {
	static void printLinkedList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Node head = null;
		Node tail = null;
		
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			Node newNode = new Node(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		printLinkedList(head);
		sc.close();
	}
}