package day5.hackerrankproblems;

import java.util.Scanner;

/*
 * HackerRank - Insertion Sort Advanced Analysis
 *
 * Count the number of inversions in an array.
 *
 * An inversion is a pair (i, j) such that:
 * i < j and arr[i] > arr[j]
 *
 * The number of inversions is equal to the number of shifts
 * performed by Insertion Sort.
 *
 * Approach:
 * Use Merge Sort to count inversions in O(n log n).
 */

public class InsertionSortAdvancedAnalysis {
	// Counts inversions using Merge Sort
	static long mergeSort(int[] arr, int left, int right) {
		// Base case
		if (left >= right) {
			return 0;
		}

		int mid = left + (right - left) / 2;

		long inversions = 0;

		// Count inversions in left half
		inversions += mergeSort(arr, left, mid);

		// Count inversions in right half
		inversions += mergeSort(arr, mid + 1, right);

		// Count cross inversions while merging
		inversions += merge(arr, left, mid, right);

		return inversions;
	}

	// Merges two sorted halves and counts inversions
	static long merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy left half
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
		}

		// Copy right half
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;

		long inversions = 0;

		// Merge both halves
		while (i < n1 && j < n2) {

			if (leftArray[i] <= rightArray[j]) {

				arr[k++] = leftArray[i++];

			} else {

				arr[k++] = rightArray[j++];

				// All remaining elements in leftArray
				// are greater than rightArray[j]
				inversions += (n1 - i);
			}
		}

		// Copy remaining left elements
		while (i < n1) {
			arr[k++] = leftArray[i++];
		}

		// Copy remaining right elements
		while (j < n2) {
			arr[k++] = rightArray[j++];
		}

		return inversions;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Number of test cases
		int t = sc.nextInt();

		while (t-- > 0) {

			// Size of array
			int n = sc.nextInt();

			int[] arr = new int[n];

			// Read array
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			// Print inversion count
			System.out.println(mergeSort(arr, 0, n - 1));
		}

		sc.close();
	}
}