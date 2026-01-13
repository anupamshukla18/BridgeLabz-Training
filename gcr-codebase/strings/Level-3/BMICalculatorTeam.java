import java.util.Scanner;
public class BMICalculatorTeam {
    // Method to compute BMI and Status for one person
    public static String[] findBMIAndStatus(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0;
        double bmi = weight / (heightMeters * heightMeters);

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            status = "Normal";
        else if (bmi >= 25.0 && bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] {
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to compute BMI table: weight, height, bmi, status
    public static String[][] computeBMIForTeam(double[][] personData) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            String[] bmiStatus = findBMIAndStatus(weight, height);

            result[i][0] = String.format("%.1f", weight);
            result[i][1] = String.format("%.1f", height);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }
        return result;
    }

    // Method to display BMI table
    public static void displayTable(String[][] bmiTable) {
        System.out.printf("%-10s %-10s %-10s %-12s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-12s\n",
                    bmiTable[i][0], bmiTable[i][1], bmiTable[i][2], bmiTable[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 Persons");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] bmiTable = computeBMIForTeam(persons);

        System.out.println("\n------ BMI Report ------");
        displayTable(bmiTable);
    }
}
