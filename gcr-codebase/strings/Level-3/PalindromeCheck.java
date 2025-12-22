import java.util.Scanner;
public class PalindromeCheck {
    // ---------- Logic 1: Iterative Start-End Comparison ----------
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // ---------- Logic 2: Recursive Palindrome Check ----------
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)      // Base Condition
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // ---------- Logic 3 Helper: Reverse string using charAt ----------
    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    // ---------- Logic 3: Compare using character arrays ----------
    public static boolean isPalindromeArrayLogic(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        if (original.length != reversed.length)
            return false;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i])
                return false;
        }
        return true;
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeArrayLogic(text);

        System.out.println("\n--- Palindrome Check Results ---");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Array Logic): " + (result3 ? "Palindrome" : "Not Palindrome"));
    }
}
