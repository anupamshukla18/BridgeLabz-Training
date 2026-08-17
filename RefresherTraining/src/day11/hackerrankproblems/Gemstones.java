package day11.hackerrankproblems;

import java.util.Scanner;

public class Gemstones {
	public static int gemstones(String[] rocks) {

		boolean[] presentInAllRocks = new boolean[26];

		// Initially assume every mineral is present
		for (int i = 0; i < 26; i++) {
			presentInAllRocks[i] = true;
		}

		for (String rock : rocks) {

			boolean[] presentInCurrentRock = new boolean[26];

			for (int i = 0; i < rock.length(); i++) {

				char mineral = rock.charAt(i);

				int index = mineral - 'a';

				presentInCurrentRock[index] = true;
			}

			// Remove minerals that are not present in this rock
			for (int i = 0; i < 26; i++) {

				if (!presentInCurrentRock[i]) {
					presentInAllRocks[i] = false;
				}
			}
		}

		int gemstoneCount = 0;

		for (int i = 0; i < 26; i++) {

			if (presentInAllRocks[i]) {
				gemstoneCount++;
			}
		}

		return gemstoneCount;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfRocks = scanner.nextInt();

		String[] rocks = new String[numberOfRocks];

		for (int i = 0; i < numberOfRocks; i++) {
			rocks[i] = scanner.next();
		}

		System.out.println(gemstones(rocks));

		scanner.close();
	}
}