import java.util.Scanner;
public class SubstringComparison {
	// Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Create substring using charAt method
        String manualSubstring = createSubstringUsingCharAt(text, start, end);

        // Using built-in substring method
        String builtinSubstring = text.substring(start, end);

        // Compare both
        boolean isEqual = compareStrings(manualSubstring, builtinSubstring);

        // Display results
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Both substrings are equal: " + isEqual);
    }
}
