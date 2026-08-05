package day4.classproblems;

import java.util.Scanner;

public class InsertionSort {
	// Insertion Sort
	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			// Shift larger elements to the right
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			// Insert the key at the correct position
			arr[j + 1] = key;
		}
	}

	// Print array
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		insertionSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}