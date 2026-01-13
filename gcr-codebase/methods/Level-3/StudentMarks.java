import java.util.Scanner;
public class StudentMarks {
	// Method to generate random 2 digit marks for PCM
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // [student][P,C,M]

        for (int i = 0; i < n; i++) {
            marks[i][0] = 40 + (int)(Math.random() * 61); // Physics (40 - 100)
            marks[i][1] = 40 + (int)(Math.random() * 61); // Chemistry
            marks[i][2] = 40 + (int)(Math.random() * 61); // Maths
        }
        return marks;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3]; 
        // [student][0]=total, [1]=avg, [2]=percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Print Scorecard
    public static void displayScorecard(int[][] marks, double[][] result) {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t"
                    + marks[i][0] + "\t\t"
                    + marks[i][1] + "\t\t"
                    + marks[i][2] + "\t\t"
                    + (int)result[i][0] + "\t"
                    + result[i][1] + "\t\t"
                    + result[i][2] + "%");
        }

        System.out.println("--------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateResults(marks);

        displayScorecard(marks, results);
    }
}
