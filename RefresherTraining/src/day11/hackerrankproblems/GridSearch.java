package day11.hackerrankproblems;

import java.util.*;

public class GridSearch {
	public static String gridSearch(List<String> G, List<String> P) {

		int R = G.size();
		int C = G.get(0).length();

		int r = P.size();
		int c = P.get(0).length();

		// Try every possible starting position
		for (int i = 0; i <= R - r; i++) {

			for (int j = 0; j <= C - c; j++) {

				boolean found = true;

				// Check the complete pattern
				for (int x = 0; x < r; x++) {

					String gridPart = G.get(i + x).substring(j, j + c);

					if (!gridPart.equals(P.get(x))) {
						found = false;
						break;
					}
				}

				if (found) {
					return "YES";
				}
			}
		}

		return "NO";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();

		while (testCases-- > 0) {

			int R = sc.nextInt();
			int C = sc.nextInt();

			List<String> G = new ArrayList<>();

			for (int i = 0; i < R; i++) {
				G.add(sc.next());
			}

			int r = sc.nextInt();
			int c = sc.nextInt();

			List<String> P = new ArrayList<>();

			for (int i = 0; i < r; i++) {
				P.add(sc.next());
			}

			System.out.println(gridSearch(G, P));
		}

		sc.close();
	}
}