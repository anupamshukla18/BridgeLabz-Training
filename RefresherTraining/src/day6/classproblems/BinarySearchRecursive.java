package day6.classproblems;

import java.util.Scanner;

public class BinarySearchRecursive {
	// Recursive approach
	public static int binarySearch(int[] arr, int low, int high, int target) {
		if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);
        else
            return binarySearch(arr, mid + 1, high, target);
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
		int result = binarySearch(arr, 0, arr.length - 1, target);
		
		// Printing the result
		if (result == -1) {
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at " + result + " index");
		}
		sc.close();
	}
}
