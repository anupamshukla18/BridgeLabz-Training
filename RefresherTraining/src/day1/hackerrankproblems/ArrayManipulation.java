package day1.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// Making a difference array
		long[] diff = new long[n + 2];

		// Processing each query
		for (List<Integer> query : queries) {
			int a = query.get(0);
			int b = query.get(1);
			int k = query.get(2);

			diff[a] += k;

			if (b + 1 <= n) {
				diff[b + 1] -= k;
			}
		}

		long max = 0;
		long current = 0;

		// Calculating prefix sum and finding the maximum
		for (int i = 1; i <= n; i++) {
			current += diff[i];
			
			if (current > max) {
				max = current;
			}
		}
		// Returning the result
		return max;
	}
	public static void main(String[] args) {
		// Scanner input
	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    int m = sc.nextInt();

	    List<List<Integer>> queries = new ArrayList<>();

	    for (int i = 0; i < m; i++) {

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int k = sc.nextInt();

	        List<Integer> query = new ArrayList<>();
	        query.add(a);
	        query.add(b);
	        query.add(k);

	        queries.add(query);
	    }
	    
	    // Processing the result
	    long result = arrayManipulation(n, queries);

	    // Printing the result
	    System.out.println(result);

	    sc.close();
	}
}
