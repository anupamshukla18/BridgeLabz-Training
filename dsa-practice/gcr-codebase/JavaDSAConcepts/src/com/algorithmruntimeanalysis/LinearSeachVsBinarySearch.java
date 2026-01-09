package com.algorithmruntimeanalysis;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSeachVsBinarySearch {

	// Linear Search Method Time Complexity: O(N)
	public static int linearSearch(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// Binary Search Method time Complexity: O(log N)
	public static int binarySearch(int[] array, int target) {

		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		// creating Scanner object
		Scanner input = new Scanner(System.in);

		// Input Section
		System.out.print("Enter dataset size: ");
		int n = input.nextInt();

		int[] array = new int[n];

		// Fill array with sequential values
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		System.out.print("Enter target element to search: ");
		int target = input.nextInt();
		
		//linear search
		long starLinear=System.nanoTime();
		int linearResult=linearSearch(array, target);
		long endLinear=System.nanoTime();
		
		long linearTime=endLinear-starLinear;
		
		//binary search
		Arrays.sort(array);
		
		long startBinary=System.nanoTime();
		int binaryResult=binarySearch(array, target);
		long endBinary=System.nanoTime();
		
		long binaryTime=endBinary-startBinary;
		

		// Output Section 
		System.out.println("\n--- Search Results ---");

		if (linearResult != -1) {
			System.out.println("Linear Search: Element found at index " + linearResult);
		} else {
			System.out.println("Linear Search: Element not found");
		}

		System.out.println("Linear Search Time: " + linearTime + " ns");

		if (binaryResult != -1) {
			System.out.println("Binary Search: Element found at index " + binaryResult);
		} else {
			System.out.println("Binary Search: Element not found");
		}

		System.out.println("Binary Search Time: " + binaryTime + " ns");

		input.close();  //closing input stream
	}
}
