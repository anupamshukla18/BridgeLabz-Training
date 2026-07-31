package day1;

import java.util.*;

class CamelCaseResult {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        int count = 1;
        for (char c : chars) {
            if ((int) c >= 65 && c <= 90) count++;
            continue;
        }
        return count;
    }
}

public class CamelCase {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();

	    int result = CamelCaseResult.camelcase(s);
	    
	    System.out.println(result);

	    sc.close();
	}
}
