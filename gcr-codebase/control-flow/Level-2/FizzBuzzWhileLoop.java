import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Invalid Input! Please enter a positive integer.");
            input.close();
            return;
        }

        int i = 1;   // Counter for while loop

        // FizzBuzz using while loop
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }

            i++;  // Increment counter
        }
    }
}
