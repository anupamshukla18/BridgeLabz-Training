package day1.hackerrankproblems;

import java.util.Scanner;

public class StringTokens {
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();

		// Checking if string is empty or not
		if (str.isEmpty()) {
			System.out.println(0);
			return;
		}

		// Splitting the sentence into words
		String[] arr = str.split("[^A-Za-z]+");

		// Printing the result
		System.out.println(arr.length);

		for (String s : arr) {
			System.out.println(s);
		}
		
		sc.close();
	}
}
