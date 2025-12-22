import java.util.Scanner;

public class NumberChecker {
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

    // Method 2: Store digits into array
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

    // Method 3: Check Duck Number (number contains 0)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method 4: Check Armstrong Number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, n);
        }

        // Re-create original number from digits
        int number = 0;
        for (int d : digits) {
            number = number * 10 + d;
        }

        return sum == number;
    }

    // Method 5: Largest and Second Largest
    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method 6: Smallest and Second Smallest
    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);

        System.out.println("\nDigits of Number:");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.println("\n\nTotal Digits: " + countDigits(number));

        // Duck number test
        if (isDuckNumber(digits)) {
            System.out.println("Duck Number: YES");
        } else {
            System.out.println("Duck Number: NO");
        }

        // Armstrong check
        if (isArmstrong(digits)) {
            System.out.println("Armstrong Number: YES");
        } else {
            System.out.println("Armstrong Number: NO");
        }

        // Largest / Second Largest
        int[] large = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit = " + large[0]);
        System.out.println("Second Largest Digit = " + large[1]);

        // Smallest / Second Smallest
        int[] small = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit = " + small[0]);
        System.out.println("Second Smallest Digit = " + small[1]);
    }
}
