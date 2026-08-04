package day3.hackerrankproblems.linkedlist;

import java.util.Scanner;

public class InsertingNodeAtTail {
	static Node insertNodeAtTail(Node head, int data) {
        Node node = new Node(data);

        if (head == null) {
            return node;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        return head;
    }

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

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertNodeAtTail(head, data);
        }

        printLinkedList(head);
        sc.close();
    }
}
