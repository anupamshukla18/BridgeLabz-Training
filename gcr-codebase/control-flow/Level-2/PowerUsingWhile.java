import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Validate inputs (power should not be negative)
        if (power < 0) {
            System.out.println("Invalid Input! Power must be a non-negative integer.");
            input.close();
            return;
        }

        int result = 1;      // Initial result
        int counter = 0;     // Temporary counter variable

        // While loop runs until counter becomes equal to power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
