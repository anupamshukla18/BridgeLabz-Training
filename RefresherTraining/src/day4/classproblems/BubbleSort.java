package day4.classproblems;

import java.util.Scanner;

public class BubbleSort {
	// Bubble Sort
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			boolean swapped = false;

			// Compare adjacent elements
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					swapped = true;
				}
			}

			// Stop if already sorted
			if (!swapped) {
				break;
			}
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

		bubbleSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}