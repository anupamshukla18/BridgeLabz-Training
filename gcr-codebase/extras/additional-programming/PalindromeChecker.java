import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces & make case-insensitive
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display result
    public static void displayResult(String text, boolean result) {
        if (result)
            System.out.println("\"" + text + "\" is a Palindrome.");
        else
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = getInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
