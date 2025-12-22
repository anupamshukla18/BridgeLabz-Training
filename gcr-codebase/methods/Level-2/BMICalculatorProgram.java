import java.util.Scanner;

public class BMICalculatorProgram {
	// Method to calculate BMI for each person and store in 3rd column
    public static void calculateBMI(double[][] details) {
        for (int i = 0; i < details.length; i++) {
            double weight = details[i][0];        // kg
            double heightCm = details[i][1];      // cm
            double heightMeters = heightCm / 100; // convert to meters

            double bmi = weight / (heightMeters * heightMeters);
            details[i][2] = bmi;
        }
    }

    // Method to determine BMI status based on BMI table provided
    public static String[] getBMIStatus(double[][] details) {
        String[] status = new String[details.length];

        for (int i = 0; i < details.length; i++) {
            double bmi = details[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D Array: [10][3]
        // Column 0 → Weight
        // Column 1 → Height (cm)
        // Column 2 → BMI
        double[][] personDetails = new double[10][3];

        // Take input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personDetails[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personDetails[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personDetails);

        // Get BMI Status
        String[] bmiStatus = getBMIStatus(personDetails);

        // Display BMI Report
        System.out.println("\n-------------------- BMI Report --------------------");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf(
                    "%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1),
                    personDetails[i][0],
                    personDetails[i][1],
                    personDetails[i][2],
                    bmiStatus[i]
            );
        }
    }
}
