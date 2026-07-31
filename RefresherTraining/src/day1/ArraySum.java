package day1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'simpleArraySum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY ar as parameter.
	 */

	public static int simpleArraySum(List<Integer> ar) {
		// Write your code here
		int sum = 0;
		for (int val : ar) {
			sum += val;
		}
		return sum;
	}

}

public class ArraySum {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading the number of elements
        int arCount = sc.nextInt();

        // Reading the array elements
        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            ar.add(sc.nextInt());
        }

        // Calling function
        int result = Result.simpleArraySum(ar);

        // Printing result
        System.out.println(result);

        sc.close();
    }
}