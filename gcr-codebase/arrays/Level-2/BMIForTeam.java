import java.util.Scanner;

public class BMIForTeam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Number of persons must be greater than 0.");
            input.close();
            return;
        }

        double[] weight = new double[n];
        double[] heightCm = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // -------- Take Input --------
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter Height (cm): ");
            heightCm[i] = input.nextDouble();

            if (weight[i] <= 0 || heightCm[i] <= 0) {
                System.out.println("Invalid values! Enter positive height and weight.");
                i--; // re-enter this person's data
            }
        }

        // -------- Calculate BMI & Status --------
        for (int i = 0; i < n; i++) {

            double heightMeters = heightCm[i] / 100.0;
            bmi[i] = weight[i] / (heightMeters * heightMeters);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }

        // -------- Display Result --------
        System.out.println("\n---------------- BMI Report ----------------");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height : " + heightCm[i] + " cm");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + bmi[i]);
            System.out.println("Status : " + status[i]);
        }
    }
}
