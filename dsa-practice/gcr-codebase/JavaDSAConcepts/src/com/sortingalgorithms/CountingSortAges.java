package com.sortingalgorithms;

import java.util.Scanner;

public class CountingSortAges {
	// Counting Sort method (SAFE & DYNAMIC)
	static void countingSort(int[] ages) {
		// Step 1: Find min and max age dynamically
		int min = ages[0];
		int max = ages[0];

		for (int age : ages) {
			if (age < min)
				min = age;
			if (age > max)
				max = age;
		}

		// Step 2: Create count array
		int range = max - min + 1;
		int[] count = new int[range];
		int[] output = new int[ages.length];

		// Step 3: Store frequency of each age
		for (int age : ages) {
			count[age - min]++;
		}

		// Step 4: Compute cumulative frequency
		for (int i = 1; i < range; i++) {
			count[i] += count[i - 1];
		}

		// Step 5: Build output array (stable sort)
		for (int i = ages.length - 1; i >= 0; i--) {
			output[count[ages[i] - min] - 1] = ages[i];
			count[ages[i] - min]--;
		}

		// Step 6: Copy sorted values back
		for (int i = 0; i < ages.length; i++) {
			ages[i] = output[i];
		}
	}

	// Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		int[] ages = new int[n];

		System.out.println("Enter students' ages:");
		for (int i = 0; i < n; i++) {
			ages[i] = sc.nextInt();
		}

		countingSort(ages);

		System.out.println("Sorted Ages in Ascending Order:");
		for (int age : ages) {
			System.out.print(age + " ");
		}

		sc.close();
	}
}
