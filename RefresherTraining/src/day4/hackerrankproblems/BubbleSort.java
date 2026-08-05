package day4.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
	// Bubble Sort
	public static void countSwaps(List<Integer> a) {
		int countSwaps = 0;

		for (int i = 0; i < a.size(); i++) {
			boolean swapped = false;

			// Compare adjacent elements
			for (int j = 0; j < a.size() - i - 1; j++) {
				if (a.get(j) > a.get(j + 1)) {
					int temp = a.get(j + 1);
					a.set(j + 1, a.get(j));
					a.set(j, temp);
 
					swapped = true;
					countSwaps++;
				}
			}

			// Stop if already sorted
			if (!swapped) {
				break;
			}
		}

		System.out.println("Array is sorted in " + countSwaps + " swaps.");
		System.out.println("First Element: " + a.get(0));
		System.out.println("Last Element: " + a.get(a.size() - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read input
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		countSwaps(a);
		sc.close();
	}
}