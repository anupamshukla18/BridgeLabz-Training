import java.util.Scanner;

public class FactorOperations {
	// Method to return factors array
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop → count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Greatest factor (last element of sorted factor list)
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Product of cubes of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int f : factors) {
            product *= Math.pow(f, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] factors = getFactors(number);

        System.out.print("\nFactors of " + number + ": ");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
    }
}
