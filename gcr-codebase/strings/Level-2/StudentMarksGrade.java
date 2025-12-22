import java.util.Random;
import java.util.Scanner;
public class StudentMarksGrade {
    // Method to generate random 2-digit PCM marks for n students
    public static int[][] generateMarks(int n) {
        Random random = new Random();
        int[][] marks = new int[n][3]; // PCM

        for (int i = 0; i < n; i++) {
            marks[i][0] = random.nextInt(90) + 10; // Physics 10 - 99
            marks[i][1] = random.nextInt(90) + 10; // Chemistry
            marks[i][2] = random.nextInt(90) + 10; // Math
        }
        return marks;
    }

    // Method to calculate Total, Average, Percentage rounded to 2 digits
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];  
        // 0 -> Total, 1 -> Average, 2 -> Percentage

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 digits using Math.round()
            avg = Math.round(avg * 100) / 100.0;
            percent = Math.round(percent * 100) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    // Method to calculate grade based on % table
    public static char[] calculateGrades(double[][] result) {
        char[] grade = new char[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80) grade[i] = 'A';
            else if (percent >= 70) grade[i] = 'B';
            else if (percent >= 60) grade[i] = 'C';
            else if (percent >= 50) grade[i] = 'D';
            else if (percent >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        return grade;
    }

    // Display scorecard in tabular form
    public static void displayScoreCard(
            int[][] marks, double[][] result, char[] grade) {

        System.out.printf("%-8s %-10s %-10s %-10s %-10s %-10s %-12s %-8s\n",
                "Roll", "Physics", "Chemistry", "Math", "Total",
                "Average", "Percent(%)", "Grade");
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8c\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grade[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateResults(marks);
        char[] grades = calculateGrades(result);

        System.out.println("\n----- STUDENT SCORECARD -----");
        displayScoreCard(marks, result, grades);
    }
}
