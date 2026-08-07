package day5.classproblems;

import java.util.Scanner;

public class QuickSortHoare {
	// Recursive Quick Sort
	static void quickSort(int[] arr, int low, int high) {

		// Base case
		if (low < high) {

			// Partition the array
			int pivotIndex = partition(arr, low, high);

			// Sort left sub-array
			quickSort(arr, low, pivotIndex);

			// Sort right sub-array
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Hoare Partition
	static int partition(int[] arr, int low, int high) {
		// First element is the pivot
		int pivot = arr[low];

		int i = low - 1;
		int j = high + 1;

		while (true) {

			// Move from left
			do {
				i++;
			} while (arr[i] < pivot);

			// Move from right
			do {
				j--;
			} while (arr[j] > pivot);

			// Partition complete
			if (i >= j) {
				return j;
			}

			// Swap elements
			swap(arr, i, j);
		}
	}

	// Swap two elements
	static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Print array
	static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, n - 1);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}