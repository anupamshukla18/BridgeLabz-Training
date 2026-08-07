package day6.hackerrankproblems;

import java.util.*;

public class IceCreamParlor {
	public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
		// Stores (cost, index)
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.size(); i++) {

			int current = arr.get(i);
			int complement = m - current;

			// Found the required pair
			if (map.containsKey(complement)) {
				return Arrays.asList(map.get(complement) + 1, i + 1);
			}

			map.put(current, i);
		}

		return new ArrayList<>();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int m = sc.nextInt();
			int n = sc.nextInt();

			List<Integer> arr = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				arr.add(sc.nextInt());
			}

			List<Integer> result = icecreamParlor(m, arr);

			for (int num : result) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}