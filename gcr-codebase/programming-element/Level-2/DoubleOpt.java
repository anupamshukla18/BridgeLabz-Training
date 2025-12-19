// Writing Java Code to perform double operations
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        // Creating variables
        double a, b, c;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter value of a: ");
        a = input.nextDouble();
        System.out.print("Enter value of b: ");
        b = input.nextDouble();
        System.out.print("Enter value of c: ");
        c = input.nextDouble();

        // Performing operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Displaying result
        System.out.println("The results of Double Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close(); // Closing the Scanner object
    }
}