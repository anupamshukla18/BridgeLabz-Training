package day1.hackerrankproblems;

import java.io.*;
import java.util.*;

public class AnagramString {
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		// Checking whether Strings are anagram or not
		boolean result = isAnagram(a, b);

		// Printing the result
		System.out.println(result ? "Anagrams" : "Not Anagrams");

		sc.close();
	}

	static boolean isAnagram(String a, String b) {
		// Converting the strings to lowercase
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length()) {
			return false;
		}

		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();

		// Sorting the char arrays 
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Returning the result
		return Arrays.equals(arr1, arr2);
	}
}
