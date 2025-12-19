import java.util.Scanner;

public class BMIMultiDimensionalArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Number of persons must be greater than 0.");
            input.close();
            return;
        }

        // Multi-Dimensional Array: [person][0=weight, 1=height, 2=BMI]
        double[][] personData = new double[number][3];

        // Status Array
        String[] weightStatus = new String[number];

        // ---------- INPUT ----------
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            double weight = input.nextDouble();

            System.out.print("Enter Height (cm): ");
            double heightCm = input.nextDouble();

            // Validation
            if (weight <= 0 || heightCm <= 0) {
                System.out.println("Invalid! Weight and Height must be positive values.");
                i--;   // Re-enter for same person
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = heightCm;
        }

        // ---------- BMI CALCULATION ----------
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double heightMeters = personData[i][1] / 100.0;

            double bmi = weight / (heightMeters * heightMeters);
            personData[i][2] = bmi;

            // Weight Status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        // ---------- DISPLAY RESULT ----------
        System.out.println("\n------------- BMI REPORT -------------");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " cm");
            System.out.println("BMI    : " + personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
        }
    }
}
