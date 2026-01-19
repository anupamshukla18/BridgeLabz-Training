package com.collections.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListDemo {
	// Reverse ArrayList using two-pointer technique
	public static <T> void reverseArrayList(ArrayList<T> list) {
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			T temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);

			left++;
			right--;
		}
	}

	// Reverse LinkedList without using built-in reverse
	public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
		LinkedList<T> reversed = new LinkedList<>();

		for (T element : list) {
			reversed.addFirst(element);
		}

		return reversed;
	}

	public static void main(String[] args) {

		// -------- ArrayList Example --------
		ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		System.out.println("Original ArrayList: " + arrayList);

		reverseArrayList(arrayList);
		System.out.println("Reversed ArrayList: " + arrayList);

		// -------- LinkedList Example --------
		LinkedList<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
		System.out.println("\nOriginal LinkedList: " + linkedList);

		LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
		System.out.println("Reversed LinkedList: " + reversedLinkedList);
	}
}
