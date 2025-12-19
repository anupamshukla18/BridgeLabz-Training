import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;   // Store original number
        int sum = 0;                   // To store sum of digits

        // Make sure we work with positive number for digit calculation
        if (number < 0) {
            number = -number;
        }

        // Loop to sum digits
        while (number != 0) {
            int digit = number % 10;   // Get last digit
            sum = sum + digit;         // Add to sum
            number = number / 10;      // Remove last digit
        }

        // Check Harshad condition
        if (sum != 0 && originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number");
        }

        input.close();
    }
}
