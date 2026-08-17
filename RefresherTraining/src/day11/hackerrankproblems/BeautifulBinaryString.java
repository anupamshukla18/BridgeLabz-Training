package day11.hackerrankproblems;

import java.util.Scanner;

public class BeautifulBinaryString {
	public static int beautifulBinaryString(String b) {

		int minimumMoves = 0;

		for (int i = 0; i <= b.length() - 3; i++) {

			if (b.substring(i, i + 3).equals("010")) {

				minimumMoves++;
				i += 2;
			}
		}

		return minimumMoves;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		String binaryString = scanner.next();

		System.out.println(beautifulBinaryString(binaryString));

		scanner.close();
	}
}