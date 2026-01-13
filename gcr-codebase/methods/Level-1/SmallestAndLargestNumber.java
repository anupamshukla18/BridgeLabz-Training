import java.util.Scanner;
public class SmallestAndLargestNumber {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest, largest;

        // Finding the smallest number
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        // Finding the largest number
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter third number: ");
        int n3 = input.nextInt();

        int[] result = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest Number = " + result[0]);
        System.out.println("Largest Number = " + result[1]);
    }
}
