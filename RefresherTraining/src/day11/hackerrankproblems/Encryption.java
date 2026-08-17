package day11.hackerrankproblems;

import java.util.*;

public class Encryption {
	public static String encryption(String s) {

		// Remove spaces
		s = s.replaceAll(" ", "");

		int n = s.length();

		// Find rows and columns
		int rows = (int) Math.floor(Math.sqrt(n));
		int cols = (int) Math.ceil(Math.sqrt(n));

		if (rows * cols < n) {
			rows++;
		}

		StringBuilder result = new StringBuilder();

		// Read column-wise
		for (int col = 0; col < cols; col++) {

			for (int row = 0; row < rows; row++) {

				int index = row * cols + col;

				if (index < n) {
					result.append(s.charAt(index));
				}
			}

			result.append(" ");
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String result = encryption(s);

		System.out.println(result);

		sc.close();
	}
}