package day1.hackerrankproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagrams {
	public static int sherlockAndAnagrams(String s) {

        HashMap<String, Integer> map = new HashMap<>();

        // Generating all the substrings
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                // Getting the substring
                String sub = s.substring(i, j);

                // Converting to char array and sorting
                char[] arr = sub.toCharArray();
                Arrays.sort(arr);

                // Sorting the substring which becomes the key
                String key = new String(arr);

                // Storing the frequencies
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int count = 0;

        // Calculating the pairs
        for (int freq : map.values()) {

            if (freq > 1) {
                count += (freq * (freq - 1)) / 2;
            }
        }
        // Returning the result
        return count;
    }
	public static void main(String[] args) {
		// Scanner input
	    Scanner sc = new Scanner(System.in);

	    int q = sc.nextInt();

	    while (q-- > 0) {
	        String s = sc.next();
	        
	        // Printing the result
	        System.out.println(sherlockAndAnagrams(s));
	    }

	    sc.close();
	}
}
