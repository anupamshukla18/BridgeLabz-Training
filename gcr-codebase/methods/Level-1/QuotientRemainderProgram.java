import java.util.Scanner;
public class QuotientRemainderProgram {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];

        result[0] = number % divisor;  // remainder
        result[1] = number / divisor;  // quotient

		// Returns int array → index 0 = remainder, index 1 = quotient
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Checking if the divisor is not zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero!");
            return;
        }

        // Calling the method
        int[] output = findRemainderAndQuotient(number, divisor);

        // Displaying the result
        System.out.println("Remainder = " + output[0]);
        System.out.println("Quotient = " + output[1]);
    }
}
