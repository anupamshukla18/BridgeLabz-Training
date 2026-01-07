package com.sortingalgorithms;

import java.util.Scanner;

public class HeapSortSalary {
	// Heap Sort method
	static void heapSort(int[] arr) {
		int n = arr.length;

		// Build Max Heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		// Extract elements from heap
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	// Heapify a subtree
	static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of applicants: ");
		int n = sc.nextInt();

		int[] salary = new int[n];

		System.out.println("Enter expected salary demands:");
		for (int i = 0; i < n; i++) {
			salary[i] = sc.nextInt();
		}

		heapSort(salary);

		System.out.println("Sorted Salary Demands in Ascending Order:");
		for (int s : salary) {
			System.out.print(s + " ");
		}
	}
}
