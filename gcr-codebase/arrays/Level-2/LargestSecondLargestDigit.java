import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Handle negative number
        if (number < 0) {
            number = -number;
        }

        int maxDigit = 10;                  // Maximum digits stored
        int[] digits = new int[maxDigit];   // Array to store digits
        int index = 0;                      // To track array index

        // Store digits in array
        while (number != 0) {
            int digit = number % 10;        // Get last digit
            digits[index] = digit;          // Store in array
            index++;

            // If array is full → stop storing
            if (index == maxDigit) {
                break;
            }

            number = number / 10;           // Remove last digit
        }

        // If number has less than 2 digits
        if (index < 2) {
            System.out.println("Number does not have enough digits to find second largest.");
            input.close();
            return;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest Digit       : " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
