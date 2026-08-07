package day5.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * HackerRank - Quicksort 2: Sorting
 *
 * Uses QuickSort with:
 * 1. First element as pivot
 * 2. Stable partitioning (maintains order)
 * 3. Recursively sorts left then right
 * 4. Prints the sub-array after every merge
 */

public class QuickSortSorting {
	// Recursive QuickSort
	static void quickSort(List<Integer> arr) {

		// Base case
		if (arr.size() <= 1) {
			return;
		}

		// First element is chosen as pivot
		int pivot = arr.get(0);

		// Left and right partitions
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();

		// Partition the array
		for (int i = 1; i < arr.size(); i++) {

			if (arr.get(i) < pivot) {
				left.add(arr.get(i));
			} else {
				right.add(arr.get(i));
			}
		}

		// Sort left partition first
		quickSort(left);

		// Sort right partition
		quickSort(right);

		// Merge: Left + Pivot + Right
		arr.clear();
		arr.addAll(left);
		arr.add(pivot);
		arr.addAll(right);

		// Print the current sorted sub-array
		printArray(arr);
	}

	// Prints a list
	static void printArray(List<Integer> arr) {

		for (int i = 0; i < arr.size(); i++) {

			System.out.print(arr.get(i));

			if (i != arr.size() - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Size of array
		int n = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		// Read array elements
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		// Perform QuickSort
		quickSort(arr);

		sc.close();
	}
}