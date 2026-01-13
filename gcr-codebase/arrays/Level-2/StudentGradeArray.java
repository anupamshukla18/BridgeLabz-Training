import java.util.Scanner;

public class StudentGradeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input! Number of students must be greater than 0.");
            input.close();
            return;
        }

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        // -------- Input Marks --------
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = input.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = input.nextDouble();

            System.out.print("Maths: ");
            maths[i] = input.nextDouble();

            // Validate marks (negative or above 100)
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0 ||
                physics[i] > 100 || chemistry[i] > 100 || maths[i] > 100) {

                System.out.println("Invalid Marks! Enter values between 0 and 100.");
                i--;     // decrement to retake same student input
            }
        }

        // -------- Calculate Percentage & Grade --------
        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // -------- Display Result --------
        System.out.println("\n---------------- Student Result ----------------");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks   : " + physics[i]);
            System.out.println("Chemistry Marks : " + chemistry[i]);
            System.out.println("Maths Marks     : " + maths[i]);
            System.out.println("Percentage      : " + percentage[i] + "%");
            System.out.println("Grade           : " + grade[i]);
        }
    }
}
