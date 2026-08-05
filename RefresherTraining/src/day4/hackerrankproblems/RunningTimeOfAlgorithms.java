package day4.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunningTimeOfAlgorithms {
	// Count shifts in Insertion Sort
	public static int runningTime(List<Integer> arr) {
		int shifts = 0;

		for (int i = 1; i < arr.size(); i++) {
			int key = arr.get(i);
			int j = i - 1;

			while (j >= 0 && arr.get(j) > key) {
				arr.set(j + 1, arr.get(j));
				shifts++;
				j--;
			}

			arr.set(j + 1, key);
		}

		return shifts;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println(runningTime(arr));

		sc.close();
	}
}