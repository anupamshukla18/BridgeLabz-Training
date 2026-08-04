package day1.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		// Scanner input 
        Scanner sc = new Scanner(System.in); 
        int arCount = sc.nextInt();

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            ar.add(sc.nextInt());
        }

        // Calling the function
        int result = simpleArraySum(ar);

        // Printing result
        System.out.println(result);

        sc.close();
    }
	
	public static int simpleArraySum(List<Integer> ar) {
		int sum = 0;
		
		for (int val : ar) {
			sum += val;
		}
		
		return sum;
	}
}