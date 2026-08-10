package day7.classproblem;

import java.util.Scanner;

public class DigitSum {
	public static int digitSum(int num) {
		// Base case
		if (num == 0) {
			return 0;
		}
		// Recursive case
		return (num % 10) + digitSum(num / 10);
	}
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose sum is to be determined: ");
		int num = sc.nextInt();
		
		// Processing the result
		int result = digitSum(num);
		
		// Printing the sum
		System.out.println("Digit Sum: " + result);
		
		sc.close();
	}
}
