package day1;

import java.util.*;

class PlusMinusResult {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		int n = arr.size();
		for (int i : arr) {
			if (i > 0) {
				positive++;
			} else if (i < 0) {
				negative++;
			} else {
				zeros++;
			}
		}
		System.out.printf("%.6f%n", (double) positive / n);
		System.out.printf("%.6f%n", (double) negative / n);
		System.out.printf("%.6f%n", (double) zeros / n);

	}
}

public class PlusMinus {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Read the array elements
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		PlusMinusResult.plusMinus(arr);

		sc.close();
	}
}