import java.util.Scanner;

public class FactorialRecursion {

    // Function to take user input
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Function to display result
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = getInput(sc);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
        } else {
            long fact = factorial(number);
            displayResult(number, fact);
        }
    }
}
