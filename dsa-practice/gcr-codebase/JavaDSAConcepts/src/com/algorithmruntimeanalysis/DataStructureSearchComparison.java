package com.algorithmruntimeanalysis;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class DataStructureSearchComparison {

	// Linear search in array
	// Time Complexity: O(N)
	public static boolean searchInArray(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return true;
			}
		}
		return false;
	}

	// Main method
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Taking dataset size from user
		System.out.print("Enter dataset size: ");
		int dataSize = input.nextInt();

		// Creating array, HashSet and TreeSet
		int[] array = new int[dataSize];
		HashSet<Integer> hashSet = new HashSet<>();
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Filling data structures
		for (int i = 0; i < dataSize; i++) {
			array[i] = i;
			hashSet.add(i);
			treeSet.add(i);
		}

		// Taking search element
		System.out.print("Enter element to search: ");
		int target = input.nextInt();

		// Searching in array
		long arrayStartTime = System.nanoTime();
		boolean arrayResult = searchInArray(array, target);
		long arrayEndTime = System.nanoTime();

		// Searching in HashSet
		long hashSetStartTime = System.nanoTime();
		boolean hashSetResult = hashSet.contains(target);
		long hashSetEndTime = System.nanoTime();

		// Searching in TreeSet
		long treeSetStartTime = System.nanoTime();
		boolean treeSetResult = treeSet.contains(target);
		long treeSetEndTime = System.nanoTime();

		// Displaying results
		System.out.println("\nSearch Results");
		System.out.println("Array Found    : " + arrayResult);
		System.out.println("Array Time    : " +
				(arrayEndTime - arrayStartTime) + " ns");

		System.out.println("HashSet Found : " + hashSetResult);
		System.out.println("HashSet Time  : " +
				(hashSetEndTime - hashSetStartTime) + " ns");

		System.out.println("TreeSet Found : " + treeSetResult);
		System.out.println("TreeSet Time  : " +
				(treeSetEndTime - treeSetStartTime) + " ns");

		input.close();
	}
}
