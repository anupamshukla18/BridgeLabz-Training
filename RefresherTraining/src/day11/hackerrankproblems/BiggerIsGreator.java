package day11.hackerrankproblems;

import java.util.*;

public class BiggerIsGreator {
	public static String biggerIsGreater(String w) {

		char[] arr = w.toCharArray();

		// Step 1: Find the rightmost character
		// that is smaller than the character after it
		int i = arr.length - 2;

		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		// No bigger permutation exists
		if (i < 0) {
			return "no answer";
		}

		// Step 2: Find the smallest character greater than arr[i]
		// from the right side
		int j = arr.length - 1;

		while (arr[j] <= arr[i]) {
			j--;
		}

		// Step 3: Swap
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		// Step 4: Reverse everything after i
		int left = i + 1;
		int right = arr.length - 1;

		while (left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		return new String(arr);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {

			String w = sc.next();

			String result = biggerIsGreater(w);

			System.out.println(result);
		}

		sc.close();
	}
}