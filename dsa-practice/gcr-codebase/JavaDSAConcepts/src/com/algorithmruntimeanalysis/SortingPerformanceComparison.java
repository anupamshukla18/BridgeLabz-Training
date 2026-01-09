package com.algorithmruntimeanalysis;
import java.util.Arrays;
import java.util.Scanner;

public class SortingPerformanceComparison {

	// Bubble Sort  Time Complexity: O(N^2)
	public static void bubbleSort(int[] array) {

		int length = array.length;
		boolean isSwapped;

		for (int i = 0; i < length - 1; i++) {
			isSwapped = false;

			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1]) {

					// swap adjacent elements
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					isSwapped = true;
				}
			}

			// If no swapping happened, array is already sorted
			if (!isSwapped) {
				break;
			}
		}
	}

	// Merge Sort
	public static void conquer(int[] array, int startIndex, int midIndex, int endIndex) {

		int[] mergedArray = new int[endIndex - startIndex + 1];
		int leftIndex = startIndex;
		int rightIndex = midIndex + 1;
		int mergedIndex = 0;

		while (leftIndex <= midIndex && rightIndex <= endIndex) {
			if (array[leftIndex] <= array[rightIndex]) {
				mergedArray[mergedIndex++] = array[leftIndex++];
			} else {
				mergedArray[mergedIndex++] = array[rightIndex++];
			}
		}

		while (leftIndex <= midIndex) {
			mergedArray[mergedIndex++] = array[leftIndex++];
		}

		while (rightIndex <= endIndex) {
			mergedArray[mergedIndex++] = array[rightIndex++];
		}

		for (int i = 0, j = startIndex; i < mergedArray.length; i++, j++) {
			array[j] = mergedArray[i];
		}
	}

	public static void divide(int[] array, int startIndex, int endIndex) {

		if (startIndex >= endIndex) {
			return;
		}

		int midIndex = startIndex + (endIndex - startIndex) / 2;

		divide(array, startIndex, midIndex);
		divide(array, midIndex + 1, endIndex);
		conquer(array, startIndex, midIndex, endIndex);
	}

	//  Quick Sort
	public static int partition(int[] array, int lowIndex, int highIndex) {

		int pivot = array[highIndex];
		int i = lowIndex - 1;

		for (int j = lowIndex; j < highIndex; j++) {
			if (array[j] < pivot) {
				i++;

				// swap
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		i++;
		int temp = array[i];
		array[i] = pivot;
		array[highIndex] = temp;

		return i;
	}

	public static void quickSort(int[] array, int lowIndex, int highIndex) {

		if (lowIndex < highIndex) {
			int pivotIndex = partition(array, lowIndex, highIndex);
			quickSort(array, lowIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, highIndex);
		}
	}

	// Main Method
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter dataset size: ");
		int dataSize = input.nextInt();

		int[] originalArray = new int[dataSize];

		// Fill array with random values
		for (int i = 0; i < dataSize; i++) {
			originalArray[i] = (int) (Math.random() * dataSize);
		}

		// Create copies for fair comparison
		int[] bubbleSortArray = Arrays.copyOf(originalArray, dataSize);
		int[] mergeSortArray = Arrays.copyOf(originalArray, dataSize);
		int[] quickSortArray = Arrays.copyOf(originalArray, dataSize);

		//  Bubble Sort Timing
		long bubbleStartTime = System.nanoTime();
		bubbleSort(bubbleSortArray);
		long bubbleEndTime = System.nanoTime();

		// Merge Sort Timing
		long mergeStartTime = System.nanoTime();
		divide(mergeSortArray, 0, dataSize - 1);
		long mergeEndTime = System.nanoTime();

		//  Quick Sort Timing
		long quickStartTime = System.nanoTime();
		quickSort(quickSortArray, 0, dataSize - 1);
		long quickEndTime = System.nanoTime();

		// Output 
		System.out.println("\n--- Sorting Performance Comparison ---");
		System.out.println("Bubble Sort Time : " + (bubbleEndTime - bubbleStartTime) + " ns");
		System.out.println("Merge Sort Time  : " + (mergeEndTime - mergeStartTime) + " ns");
		System.out.println("Quick Sort Time  : " + (quickEndTime - quickStartTime) + " ns");

		input.close(); //closing input stream
	}
}
