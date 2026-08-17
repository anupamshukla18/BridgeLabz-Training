package day11.hackerrankproblems;

import java.util.*;

public class TimeInWords {
	public static String timeInWords(int h, int m) {
		String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine" };

		// Exactly on the hour
		if (m == 0) {
			return numbers[h] + " o' clock";
		}

		// 15 minutes
		if (m == 15) {
			return "quarter past " + numbers[h];
		}

		// 30 minutes
		if (m == 30) {
			return "half past " + numbers[h];
		}

		// Less than 30 minutes
		if (m < 30) {

			if (m == 1) {
				return "one minute past " + numbers[h];
			}

			return numbers[m] + " minutes past " + numbers[h];
		}

		// More than 30 minutes
		int remaining = 60 - m;

		int nextHour = h + 1;

		if (nextHour == 13) {
			nextHour = 1;
		}

		if (remaining == 1) {
			return "one minute to " + numbers[nextHour];
		}

		return numbers[remaining] + " minutes to " + numbers[nextHour];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		String result = timeInWords(h, m);

		System.out.println(result);

		sc.close();
	}
}