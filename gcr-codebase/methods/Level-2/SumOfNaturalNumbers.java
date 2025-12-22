import java.util.Scanner;

public class SumOfNaturalNumbers {
	// Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Validate natural number
        if (n <= 0) {
            System.out.println("Invalid Input! Please enter a natural positive number.");
            return;
        }

        // Calculate using recursion
        int recursiveResult = recursiveSum(n);

        // Calculate using formula
        int formulaResult = formulaSum(n);

        // Display results
        System.out.println("Sum using Recursion = " + recursiveResult);
        System.out.println("Sum using Formula  = " + formulaResult);

        // Compare and verify correctness
        if (recursiveResult == formulaResult) {
            System.out.println("Both results are equal. Computation is correct!");
        } else {
            System.out.println("Results are not matching.");
        }
    }
}
