// Writing Java Code to perform integer operations
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        // Creating variables
        int a, b, c;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        System.out.print("Enter value of c: ");
        c = input.nextInt();

        // Performing operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Displaying result
        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close(); // Closing the Scanner object
    }
}