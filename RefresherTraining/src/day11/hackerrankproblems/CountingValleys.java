package day11.hackerrankproblems;

import java.util.Scanner;

public class CountingValleys {
	public static int countingValleys(int steps, String path) {

		int altitude = 0;
		int valleys = 0;

		for (int i = 0; i < steps; i++) {

			if (path.charAt(i) == 'U') {
				altitude++;

				if (altitude == 0) {
					valleys++;
				}

			} else {
				altitude--;
			}
		}

		return valleys;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int steps = sc.nextInt();
		String path = sc.next();

		int result = countingValleys(steps, path);

		System.out.println(result);

		sc.close();
	}
}