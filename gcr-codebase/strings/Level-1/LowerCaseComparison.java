import java.util.Scanner;
public class LowerCaseComparison {
    // Method to manually convert uppercase letters to lowercase
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase A-Z
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);   // Convert to lowercase using ASCII difference 32
            }

            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // If lengths differ → directly false
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.nextLine();

        // Built-in lowercase
        String builtinLower = text.toLowerCase();

        // User-defined lowercase
        String manualLower = convertToLowerCase(text);

        // Compare results
        boolean isSame = compareStrings(builtinLower, manualLower);

        System.out.println("\nBuilt-in Lowercase   : " + builtinLower);
        System.out.println("Manual Lowercase     : " + manualLower);
        System.out.println("Are both same?       : " + isSame);
    }
}
