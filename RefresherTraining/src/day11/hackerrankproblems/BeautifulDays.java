package day11.hackerrankproblems;

import java.util.*;

public class BeautifulDays{
	public static int beautifulDays(int i, int j, int k) {

		int count = 0;

		for (int day = i; day <= j; day++) {

			int original = day;
			int reverse = 0;

			// Reverse the number
			while (original != 0) {
				int digit = original % 10;
				reverse = reverse * 10 + digit;
				original /= 10;
			}

			// Check if difference is divisible by k
		if (Math.abs(day - reverse) % k == 0) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		int result = beautifulDays(i, j, k);

		System.out.println(result);

		sc.close();
	}
}