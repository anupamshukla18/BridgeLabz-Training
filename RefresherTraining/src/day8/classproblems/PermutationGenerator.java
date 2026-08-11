package day8.classproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationGenerator {
	public static void generatePermutation(int[] arr, boolean[] used, List<Integer> current, List<List<Integer>> result) {
		// Base case 
		if (current.size() == arr.length) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (used[i]) continue;

			used[i] = true;
			current.add(arr[i]);
			generatePermutation(arr, used, current, result);

			current.remove(current.size() - 1);
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		List<List<Integer>> result = new ArrayList<>();
		generatePermutation(arr, new boolean[arr.length], new ArrayList<>(), result);

		for (List<Integer> possibility : result) {
			System.out.println(possibility);
		}
	}
}
