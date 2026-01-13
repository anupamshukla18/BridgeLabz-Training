import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();   // Take user input

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;
        }

        System.out.println("The factors of " + number + " are:");

        // Loop from 1 to number-1 to find factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {   // Check divisibility
                System.out.println(i);
            }
        }
    }
}
