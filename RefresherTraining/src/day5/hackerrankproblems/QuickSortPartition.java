package day5.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * HackerRank - Quicksort 1: Partition
 *
 * Partition the array around the first element (pivot).
 * Print:
 * Left Partition + Pivot + Right Partition
 *
 * Relative order of elements must be maintained.
 */

public class QuickSortPartition {
	// Partitions the array around the first element
	static void partition(int[] arr) {

		// First element is chosen as pivot
		int pivot = arr[0];

		// Stores elements smaller than pivot
		List<Integer> left = new ArrayList<>();

		// Stores elements greater than or equal to pivot
		List<Integer> right = new ArrayList<>();

		// Partition the array
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < pivot) {
				left.add(arr[i]);
			} else {
				right.add(arr[i]);
			}
		}

		// Print left partition
		for (int num : left) {
			System.out.print(num + " ");
		}

		// Print pivot
		System.out.print(pivot + " ");

		// Print right partition
		for (int num : right) {
			System.out.print(num + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Size of array
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Read array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Perform partition
		partition(arr);

		sc.close();
	}
}