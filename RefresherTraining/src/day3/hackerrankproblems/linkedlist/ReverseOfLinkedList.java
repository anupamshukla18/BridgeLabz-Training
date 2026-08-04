package day3.hackerrankproblems.linkedlist;

import java.util.Scanner;

public class ReverseOfLinkedList {
	static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static void printList(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data);

			if (temp.next != null) {
				System.out.print(" ");
			}

			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();

		while (tests-- > 0) {
			int n = sc.nextInt();

			Node head = null;
			Node tail = null;

			for (int i = 0; i < n; i++) {
				int data = sc.nextInt();
				Node node = new Node(data);

				if (head == null) {
					head = node;
					tail = node;
				} else {
					tail.next = node;
					tail = node;
				}
			}

			head = reverse(head);
			printList(head);
		}
		sc.close();
	}
}
