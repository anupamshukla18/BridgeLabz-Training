import java.util.Scanner;

public class FactorsOperations {
	// Method that uses Scanner object to take number
    public static int getNumber(Scanner input) {
        System.out.print("Enter a positive number: ");
        return input.nextInt();
    }

    // Method to return array of factors
    public static int[] getFactors(int number) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double sumOfSquareOfFactors(int[] factors) {
        double sumSquare = 0;
        for (int f : factors) {
            sumSquare += Math.pow(f, 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Scanner object renamed to input

        int number = getNumber(input);            // Passing input

        if (number <= 0) {
            System.out.println("Please enter a natural positive number!");
            return;
        }

        int[] factors = getFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors = " + sumOfFactors(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));
        System.out.println("Sum of square of factors = " + sumOfSquareOfFactors(factors));
    }
}
