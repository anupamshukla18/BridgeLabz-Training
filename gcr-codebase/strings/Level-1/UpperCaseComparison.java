import java.util.Scanner;
public class UpperCaseComparison {
    // Method to convert text to uppercase using ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase a-z, convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);   // Difference between lowercase and uppercase is 32
            }

            result += ch;  // Add converted character
        }

        return result;
    }

    // Method to compare two strings character by character
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();

        // User-defined uppercase conversion
        String manualUpper = convertToUpperCase(text);

        // Compare strings
        boolean isSame = compareStrings(builtInUpper, manualUpper);

        System.out.println("\nBuilt-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase  : " + manualUpper);
        System.out.println("\nAre both uppercase strings equal? " + isSame);
    }
}
