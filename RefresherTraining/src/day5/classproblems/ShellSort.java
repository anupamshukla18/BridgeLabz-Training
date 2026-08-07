package day5.classproblems;

import java.util.Scanner;

public class ShellSort {
	// Shell Sort
	static void shellSort(int[] arr) {

		int n = arr.length;

		// Reduce gap after each pass
		for (int gap = n / 2; gap > 0; gap /= 2) {

			// Perform insertion sort for current gap
			for (int i = gap; i < n; i++) {

				int temp = arr[i];
				int j = i;

				// Shift larger elements
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}

				arr[j] = temp;
			}
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

		shellSort(arr);

		System.out.println("Sorted Array:");
		printArray(arr);

		sc.close();
	}
}