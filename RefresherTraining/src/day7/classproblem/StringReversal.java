package day7.classproblem;

import java.util.Scanner;

public class StringReversal {
	public static String reverse(String str) {
		// Base case
		if (str.length() <= 1) {
			return str;
		}
		// Recursive case
		return str.substring(1) + str.charAt(0);
	}
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// Processing the input
		String result = reverse(str);
		
		// Printing the result
		System.out.println("Reversed string: " + result);
		
		sc.close();
	}
}
