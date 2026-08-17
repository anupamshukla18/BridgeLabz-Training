package day11.hackerrankproblems;

import java.util.*;

class TimeConversion {
	public static String timeConversion(String s) {
		String str = s.substring(0, 8);

		String[] timeStrings = str.split(":");

		String period = s.substring(8);

		int hh = Integer.parseInt(timeStrings[0]);

		// 12 AM -> 00
		if (period.equals("AM") && hh == 12) {
			hh = 0;
		}

		// PM except 12 PM -> add 12
		if (period.equals("PM") && hh != 12) {
			hh += 12;
		}

		String result = String.format("%02d:%s:%s", hh, timeStrings[1], timeStrings[2]);

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String result = TimeConversion.timeConversion(s);

		System.out.println(result);

		sc.close();
	}
}