import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Validate inputs (positive integers)
        if (number <= 0 || power < 0) {
            System.out.println("Invalid Input! Please enter positive integers (power can be zero or positive).");
            input.close();
            return;
        }

        int result = 1;

        // Compute power using loop
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        // Output result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
