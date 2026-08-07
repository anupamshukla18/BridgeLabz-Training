package day6.classproblems;

import java.util.Scanner;

public class LinearSearch {
	public static void linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at index : " + i);
				return;
			}
			continue;
		}
		System.out.println("Element is not there in the array");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the target element: ");
		int target = sc.nextInt();
		
		System.out.println("Enter the elements of the array: "); 
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		linearSearch(arr, target);
		sc.close();
	}
}
