package day6.classproblems;

import java.util.Scanner;

public class FirstLastOccurence {
	public static int firstOccurence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int result = 0;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] == target) {
				result = mid;
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;
 	}
	
	public static int lastOccurence(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int result = 0;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] == target) {
				result = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;
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
		int first = firstOccurence(arr, target);
		int last = lastOccurence(arr, target);
		
		System.out.println("First Occurence: " + first);
		System.out.println("Last Occurence: " + last);
		
		sc.close();
	}
}
