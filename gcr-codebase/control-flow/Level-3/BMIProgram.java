import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Validate input
        if (weight <= 0 || heightCm <= 0) {
            System.out.println("Invalid Input! Weight and Height must be positive values.");
            input.close();
            return;
        }

        // Convert height to meters
        double heightMeters = heightCm / 100.0;

        // BMI Formula
        double bmi = weight / (heightMeters * heightMeters);

        System.out.println("\n----- BMI RESULT -----");
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Height : " + heightMeters + " m");
        System.out.println("BMI    : " + bmi);

        // Determine Status
        if (bmi <= 18.4) {
            System.out.println("Status : Underweight");
        } 
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status : Normal");
        } 
        else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status : Overweight");
        } 
        else {
            System.out.println("Status : Obese");
        }
    }
}
