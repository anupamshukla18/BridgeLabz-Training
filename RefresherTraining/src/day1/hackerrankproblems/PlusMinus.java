package day1.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		// Adding the array elements
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		// Performing the operation
		plusMinus(arr);

		sc.close();
	}
	
	public static void plusMinus(List<Integer> arr) {
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
		
		// Printing the result
		System.out.printf("%.6f%n", (double) positive / n);
		System.out.printf("%.6f%n", (double) negative / n);
		System.out.printf("%.6f%n", (double) zeros / n);
	}
}