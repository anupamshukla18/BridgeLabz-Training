package day5.classproblems;

import java.util.Scanner;

public class MergeSort {
	// Recursive Merge Sort
	static void mergeSort(int[] arr, int left, int right) {
		// Base case
		if (left < right) {

			int mid = (left + right) / 2;

			// Sort left half
			mergeSort(arr, left, mid);

			// Sort right half
			mergeSort(arr, mid + 1, right);

			// Merge both halves
			merge(arr, left, mid, right);
		}
	}

	// Merge two sorted halves
	static void merge(int[] arr, int left, int mid, int right) {
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

		// Merge both halves
		while (i < n1 && j < n2) {

			if (leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
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

		mergeSort(arr, 0, n - 1);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}