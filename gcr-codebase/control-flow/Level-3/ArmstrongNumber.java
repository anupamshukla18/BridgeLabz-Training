import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;                 // To store sum of cubes of digits
        int originalNumber = number; // Store original number for comparison

        // Loop until all digits are processed
        while (originalNumber != 0) {

            // Get last digit using modulus operator
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Compare original number with calculated sum
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
    }
}
