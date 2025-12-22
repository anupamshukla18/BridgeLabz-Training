import java.util.Scanner;

public class DigitAnalyzer {
	// Method: Count digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method: Store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int n = number;

        while (n > 0) {
            digits[index] = n % 10;
            n /= 10;
            index--;
        }
        return digits;
    }

    // Method: Reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int j = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[j] = digits[i];
            j++;
        }
        return reversed;
    }

    // Method: Compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    // Method: Check Palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] rev = reverseArray(digits);
        return areArraysEqual(digits, rev);
    }

    // Method: Duck Number (contains 0)
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);

        System.out.println("\nDigits:");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nTotal Digits: " + countDigits(number));

        int[] reversed = reverseArray(digits);

        System.out.println("\nReversed Digits:");
        for (int d : reversed)
            System.out.print(d + " ");

        System.out.println("\n\nArrays Equal? " + areArraysEqual(digits, reversed));

        if (isPalindrome(digits))
            System.out.println(number + " is a Palindrome Number");
        else
            System.out.println(number + " is NOT a Palindrome Number");

        if (isDuckNumber(digits))
            System.out.println(number + " is a Duck Number");
        else
            System.out.println(number + " is NOT a Duck Number");
    }
}
