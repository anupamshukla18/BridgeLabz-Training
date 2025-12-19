import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int count = 0;          // To count digits
        int temp = number;      // Store original value for display

        // Handle case when number is 0 (has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // If negative, make it positive
            if (number < 0) {
                number = -number;
            }

            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase digit count
            }
        }

        // Display result
        System.out.println("The number of digits in " + temp + " is: " + count);
    }
}
