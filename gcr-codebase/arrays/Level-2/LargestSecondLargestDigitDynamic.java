import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Handle negative number
        if (number < 0) {
            number = -number;
        }

        int maxDigit = 10;               // Initial capacity of array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array (dynamic resizing)
        while (number != 0) {

            int digit = number % 10;
            digits[index] = digit;
            index++;

            // If array becomes full → increase size by 10
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;           // Increase capacity

                int[] temp = new int[maxDigit];     // Create new larger array

                // Copy old digits into temp
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp back to digits
                digits = temp;
            }

            number = number / 10;  // Remove last digit
        }

        if (index < 2) {
            System.out.println("Number does not have enough digits to find second largest.");
            input.close();
            return;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second-largest digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display stored digits
        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        // Display results
        System.out.println("\n\nLargest Digit       : " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
