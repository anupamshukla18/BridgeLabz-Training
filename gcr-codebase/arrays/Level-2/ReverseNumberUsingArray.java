import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Handle negative number
        int originalNumber = number;
        if (number < 0) {
            number = -number;
        }

        // -------- Step 1: Count Digits --------
        int temp = number;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        // -------- Step 2: Store Digits in Array --------
        int[] digits = new int[count];
        temp = number;
        int index = count - 1;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index--;
        }

        // -------- Step 3: Create Reverse Array --------
        int[] reverseDigits = new int[count];
        int j = 0;

        for (int i = count - 1; i >= 0; i--) {
            reverseDigits[j] = digits[i];
            j++;
        }

        // -------- Step 4: Display Result --------
        System.out.println("\nDigits Array:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nReversed Digits Array:");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i] + " ");
        }

        // Optional: Show reversed number
        System.out.print("\n\nReversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }
    }
}
