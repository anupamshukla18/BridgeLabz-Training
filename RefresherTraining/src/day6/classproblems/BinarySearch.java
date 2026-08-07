package day6.classproblems;

import java.util.Scanner;

public class BinarySearch {
	// Iterative approach
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] == target) {
				return mid;
			}
			else if (arr[mid] > target) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the target element: ");
		int target = sc.nextInt();
		
		System.out.println("Enter the elements of the sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Finding the target
		int result = binarySearch(arr, target);
		
		// Printing the result
		if (result == -1) {
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at " + result + " index");
		}
		sc.close();
	}
}
