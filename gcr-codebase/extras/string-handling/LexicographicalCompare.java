import java.util.Scanner;
public class LexicographicalCompare {
	public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;   // negative → s1 < s2, positive → s1 > s2
            }
        }

        // If all characters matched, shorter string is smaller
        if (len1 == len2)
            return 0;
        else if (len1 < len2)
            return -1;
        else
            return 1;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result == 0)
            System.out.println("Both strings are equal.");
        else if (result < 0)
            System.out.println(str1 + " is lexicographically smaller than " + str2 + " ");
        else
            System.out.println(str1 + " is lexicographically greater than " + str2 + " ");
    }
}
