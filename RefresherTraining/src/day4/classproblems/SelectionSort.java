package day4.classproblems;

import java.util.Scanner;

public class SelectionSort {
	// Selection Sort
	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;
			
			// Find the smallest element
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			// Swap with the current position
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
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

		selectionSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}