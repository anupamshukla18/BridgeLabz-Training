package day1.hackerrankproblems;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		// Scanner input
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();

	    // Storing the result
	    int result = camelcase(s);
	    
	    // Printing the result
	    System.out.println(result);

	    sc.close();
	}
	public static int camelcase(String s) {
		// Splitting the array
		String[] arr = s.split("[A-Z]");
		
		// Counting the words
		int count = arr.length;
        
		// returning the result 
        return count;
    }
}
