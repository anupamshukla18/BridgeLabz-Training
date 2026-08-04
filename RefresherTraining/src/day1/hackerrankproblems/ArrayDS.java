package day1.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDS {
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		int arrCount = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			arr.add(sc.nextInt());
		}

		// Reversing the array
		List<Integer> res = reverseArray(arr);

		// Printing the reversed array
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i));

			if (i != res.size() - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

		sc.close();
	}
	
	public static List<Integer> reverseArray(List<Integer> a) {
		
		int left = 0;
		int right = a.size() - 1;

		while (left < right) {
			int temp = a.get(left);
			a.set(left, a.get(right));
			a.set(right, temp);
			
			left++;
			right--;
		}
		
		// Returning the result
		return a;
	}
}
