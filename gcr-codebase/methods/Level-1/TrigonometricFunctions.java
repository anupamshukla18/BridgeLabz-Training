import java.util.Scanner;
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Store results in array
        double[] result = {sine, cosine, tangent};
        return result;
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Take angle input from user
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Calling the method
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.println("Sine   : " + trigValues[0]);
        System.out.println("Cosine : " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }
}
