import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();   // Take user input

        // Check for Natural Number
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a Natural Number (greater than 0).");
            input.close();
            return;   // Exit program
        }

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even Number");
            } else {
                System.out.println(i + " is an Odd Number");
            }
        }
    }
}
