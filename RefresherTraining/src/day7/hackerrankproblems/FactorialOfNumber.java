package day7.hackerrankproblems;

import java.util.Scanner;

public class FactorialOfNumber {
	public static int factorial(int num) {
		// Base case 
		if (num == 0 || num == 1) {
			return 1;
		}
		// Recursive case
		return num * factorial(num - 1);
	}
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number whose factorial is to be determined: ");
		
		int num = sc.nextInt();
		
		// Processing the result
		int result = factorial(num);
		
		// Printing the result
		System.out.println("Factorial of " + num + " : " + result );
		
		sc.close();
	}
}
