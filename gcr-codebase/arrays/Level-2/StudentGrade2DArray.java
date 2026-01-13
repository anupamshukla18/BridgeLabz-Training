import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input! Number of students must be greater than 0.");
            input.close();
            return;
        }

        // 2D array -> rows = students, columns = 3 subjects
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // ------------ INPUT MARKS ------------
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();

            // Validate - marks must be between 0 and 100
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0 ||
                marks[i][0] > 100 || marks[i][1] > 100 || marks[i][2] > 100) {

                System.out.println("Invalid Marks! Enter values between 0 and 100.");
                i--;   // retake marks for same student
            }
        }

        // ------------ CALCULATE PERCENTAGE & GRADE ------------
        for (int i = 0; i < n; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

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

        // ------------ DISPLAY RESULT ------------
        System.out.println("\n---------------- Student Result ----------------");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks   : " + marks[i][0]);
            System.out.println("Chemistry Marks : " + marks[i][1]);
            System.out.println("Maths Marks     : " + marks[i][2]);
            System.out.println("Percentage      : " + percentage[i] + "%");
            System.out.println("Grade           : " + grade[i]);
        }
    }
}
