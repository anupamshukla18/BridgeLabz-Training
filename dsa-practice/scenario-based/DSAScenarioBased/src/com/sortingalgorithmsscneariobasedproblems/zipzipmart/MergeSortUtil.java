package com.sortingalgorithmsscneariobasedproblems.zipzipmart;

// Contains Merge Sort logic for Transaction objects
class MergeSortUtil {

	// Main merge sort function
	public static void mergeSort(Transaction[] arr, int left, int right) {
		if (left < right) {

			// Find middle index
			int mid = (left + right) / 2;

			// Divide array into halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Merge sorted halves
			merge(arr, left, mid, right);
		}
	}

	// Merge two sorted subarrays
	private static void merge(Transaction[] arr, int left, int mid, int right) {

		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Temporary arrays
		Transaction[] L = new Transaction[n1];
		Transaction[] R = new Transaction[n2];

		// Copy data
		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// Merge logic (stable)
		while (i < n1 && j < n2) {

			// First compare by date
			if (L[i].date.compareTo(R[j].date) < 0) {
				arr[k++] = L[i++];
			}
			// If date is same, compare by amount
			else if (L[i].date.compareTo(R[j].date) == 0 && L[i].amount <= R[j].amount) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		// Copy remaining elements
		while (i < n1)
			arr[k++] = L[i++];

		while (j < n2)
			arr[k++] = R[j++];
	}
}
