import java.util.Scanner;

public class NumberCheckerUtility {
	// Method 1: Count digits
    public static int countDigits(int number) {
        int count = 0;
        int n = number;

        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method 2: Store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int n = number;

        while (n > 0) {
            digits[index] = n % 10;
            n /= 10;
            index--;
        }
        return digits;
    }

    // Method 3: Sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method 4: Sum of squares of digits using Math.pow()
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method 5: Check Harshad Number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method 6: Frequency of each digit using 2D array
    // Column 0 -> digit
    // Column 1 -> frequency
    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        // Initialize first column with digit values 0-9
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);

        System.out.println("\nDigits in number:");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nTotal Digits = " + countDigits(number));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits = " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits = " + sumSquares);

        if (isHarshad(number, digits)) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }

        // Frequency
        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit Frequency:");
        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
            }
        }
    }
}
