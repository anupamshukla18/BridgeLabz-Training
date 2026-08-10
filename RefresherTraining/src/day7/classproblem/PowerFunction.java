package day7.classproblem;

import java.util.Scanner;

public class PowerFunction {
	public static int power(int x, int n) {
		// Base class
		if (n == 0) {
			return 1;
		}
		// Recursive case
		return x * power(x, n-1);
	}
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value: ");
		int num = sc.nextInt();
		System.out.println("Enter its power: ");
		int power = sc.nextInt();
		
		// Processing the input
		int result = power(num, power);
		
		// Printing the result
		System.out.println(result);
		
		sc.close();
	}
}
