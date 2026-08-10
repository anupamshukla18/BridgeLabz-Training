package day7.hackerrankproblems;

import java.util.Scanner;

public class RecursiveDigitSum {
	// Recursively finds the sum of digits
	static int digitSum(int n) {

		// Base case
		if (n == 0)
			return 0;

		// Last digit + sum of remaining digits
		return (n % 10) + digitSum(n / 10);
	}

	// Recursively finds the super digit
	static int superDigit(int n) {
		// Base case: single digit
		if (n < 10)
			return n;

		// Find digit sum and call recursively
		return superDigit(digitSum(n));
	}

	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		String n = sc.next();

		System.out.print("Enter k: ");
		int k = sc.nextInt();

		// Convert string to integer
		int num = Integer.parseInt(n);

		// Find sum of digits
		int sum = digitSum(num);

		// Number is repeated k times
		sum = sum * k;

		// Find super digit recursively
		int result = superDigit(sum);

		System.out.println("Super Digit: " + result);

		sc.close();
	}
}