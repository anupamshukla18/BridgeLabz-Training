package day5.hackerrankproblems;

import java.util.Scanner;

/*
 * HackerRank - Running Time of Quicksort
 *
 * Objective:
 * Compare the running time of:
 * 1. Insertion Sort (count shifts)
 * 2. QuickSort (count swaps)
 *
 * Output:
 * Insertion Sort Shifts - QuickSort Swaps
 *
 * Note:
 * - Uses Lomuto Partition.
 * - Last element is chosen as the pivot.
 * - Count every swap, including self-swaps.
 */

public class RunningTimeOfQuickSort {
	// Stores total swaps performed by QuickSort
	static int quickSwaps = 0;

	// Counts shifts in Insertion Sort
	static int insertionSortShifts(int[] arr) {

		int shifts = 0;

		// Traverse from second element
		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			// Shift larger elements to the right
			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				shifts++;
				j--;
			}

			// Insert the current element
			arr[j + 1] = key;
		}

		return shifts;
	}

	// Recursive QuickSort
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {

			// Partition the array
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

				// Count every swap, even if i == j
				swap(arr, i, j);
				quickSwaps++;
				i++;
			}
		}

		// Place pivot at its correct position
		swap(arr, i, high);
		quickSwaps++;

		return i;
	}

	// Swaps two elements
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read array size
		int n = sc.nextInt();

		int[] insertionArray = new int[n];
		int[] quickArray = new int[n];

		// Read input into both arrays
		for (int i = 0; i < n; i++) {

			int value = sc.nextInt();

			insertionArray[i] = value;
			quickArray[i] = value;
		}

		// Count insertion sort shifts
		int insertionShifts = insertionSortShifts(insertionArray);

		// Count QuickSort swaps
		quickSort(quickArray, 0, n - 1);

		// Print the required difference
		System.out.println(insertionShifts - quickSwaps);

		sc.close();
	}
}