import java.util.Scanner;
public class TrimStringUsingCharAt {
    // Method to find start and end index (without leading/trailing spaces)
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
		
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Get trim index
        int[] indexes = trimIndexes(text);
        int start = indexes[0];
        int end = indexes[1];

        String trimmedUsingMethod;

        // Handle case if string contains only spaces
        if (start > end) {
            trimmedUsingMethod = "";
        } else {
            trimmedUsingMethod = customSubstring(text, start, end);
        }

        // Built-in trim
        String builtInTrim = text.trim();

        // Compare
        boolean isSame = compareStrings(trimmedUsingMethod, builtInTrim);

        // Display result
        System.out.println("\n--- Result ---");
        System.out.println("Original String = \"" + text + "\"");
        System.out.println("Trimmed Using Custom Method = \"" + trimmedUsingMethod + "\"");
        System.out.println("Trimmed Using built-in trim() = \"" + builtInTrim + "\"");
        System.out.println("Both Are Equal? : " + isSame);
    }
}
