import java.util.Scanner;

public class StudentVoteChecker {
	// Method to check if a student can vote
    public static boolean canStudentVote(int age) {

        // Check for invalid negative age
        if (age < 0) {
            return false;
        }

        // Check if age is 18 or above
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentAges = new int[10];   // Array to store ages of 10 students

        // Take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            boolean canVote = canStudentVote(studentAges[i]);

            // Display result
            if (studentAges[i] < 0) {
                System.out.println("Invalid age! Cannot vote.");
            } else if (canVote) {
                System.out.println("Student with age " + studentAges[i] + " CAN vote.");
            } else {
                System.out.println("Student with age " + studentAges[i] + " CANNOT vote.");
            }
        }
    }
}
