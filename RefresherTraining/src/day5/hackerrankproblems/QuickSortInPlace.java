package day5.hackerrankproblems;

import java.util.Scanner;

/*
 * HackerRank - Quicksort In-Place
 *
 * Uses:
 * 1. Lomuto Partition Scheme
 * 2. Last element as pivot
 * 3. In-place QuickSort
 * 4. Prints the entire array after every partition
 */

public class QuickSortInPlace {
	// Recursive QuickSort
	static void quickSort(int[] arr, int low, int high) {
		// Base case
		if (low < high) {

			// Partition the array and get pivot index
			int pivotIndex = partition(arr, low, high);

			// Sort left sub-array
			quickSort(arr, low, pivotIndex - 1);

			// Sort right sub-array
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Lomuto Partition
	static int partition(int[] arr, int low, int high) {
		// Last element is the pivot
		int pivot = arr[high];

		// Index of smaller element
		int i = low;

		// Rearrange elements
		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				swap(arr, i, j);
				i++;
			}
		}

		// Place pivot at its correct position
		swap(arr, i, high);

		// Print array after each partition
		printArray(arr);

		return i;
	}

	// Swaps two elements
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Prints the complete array
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

			if (i != arr.length - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Size of array
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Read array elements
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Perform QuickSort
		quickSort(arr, 0, n - 1);

		sc.close();
	}
}