package com.collections.listinterface;

import java.util.*;

public class NthFromEnd {
	static class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public static String findNthFromEnd(Node head, int n) {
		Node fast = head;
		Node slow = head;

		// Move fast pointer n steps ahead
		for (int i = 0; i < n; i++) {
			if (fast == null) {
				return "N is larger than the list length";
			}
			fast = fast.next;
		}

		// Move both pointers until fast reaches end
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow.data;
	}

	public static void main(String[] args) {
		// Creating linked list: A -> B -> C -> D -> E
		Node head = new Node("A");
		head.next = new Node("B");
		head.next.next = new Node("C");
		head.next.next.next = new Node("D");
		head.next.next.next.next = new Node("E");

		int n = 2;
		System.out.println(findNthFromEnd(head, n));
	}
}
