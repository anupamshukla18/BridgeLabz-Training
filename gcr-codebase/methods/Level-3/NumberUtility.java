import java.util.Scanner;

public class NumberUtility {
	// Method 1: Check Prime Number
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    // Method 2: Check Neon Number
    // Neon: sum of digits of square of number == number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == number;
    }

    // Method 3: Check Spy Number
    // Spy: sum of digits == product of digits
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int n = number;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return sum == product;
    }

    // Method 4: Check Automorphic Number
    // Automorphic: square ends with the number
    public static boolean isAutomorphic(int number) {
        int square = number * number;

        while (number > 0) {
            if (number % 10 != square % 10)
                return false;

            number /= 10;
            square /= 10;
        }

        return true;
    }

    // Method 5: Check Buzz Number
    // Buzz: divisible by 7 OR ends with 7
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\n----- Results -----");

        System.out.println("Prime Number: " + (isPrime(number) ? "YES" : "NO"));
        System.out.println("Neon Number: " + (isNeon(number) ? "YES" : "NO"));
        System.out.println("Spy Number: " + (isSpy(number) ? "YES" : "NO"));
        System.out.println("Automorphic Number: " + (isAutomorphic(number) ? "YES" : "NO"));
        System.out.println("Buzz Number: " + (isBuzz(number) ? "YES" : "NO"));
    }
}
