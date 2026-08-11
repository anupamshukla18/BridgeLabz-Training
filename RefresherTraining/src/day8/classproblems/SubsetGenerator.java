package day8.classproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetGenerator {
	public static void generateSubsets (int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
		// Base case
		if (index == arr.length) {
			result.add(new ArrayList<Integer>(current));
			return;
		}
		
		// Including logic
		current.add(arr[index]);
		generateSubsets(arr, index + 1, current, result);
		
		// Excluding logic
		current.remove(current.size() - 1);
		generateSubsets(arr, index + 1, current, result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		List<List<Integer>> result = new ArrayList<>();
		generateSubsets(arr, 0, new ArrayList<>(), result);
		
		for (List<Integer> subset : result) {
			System.out.println(subset);
		}
	}
}
