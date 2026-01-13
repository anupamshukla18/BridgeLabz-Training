import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        // Validate marks (optional but good practice)
        if (physics < 0 || chemistry < 0 || maths < 0 ||
            physics > 100 || chemistry > 100 || maths > 100) {
            System.out.println("Invalid Marks! Marks should be between 0 and 100.");
            input.close();
            return;
        }

        // Calculate Average Percentage
        double average = (physics + chemistry + maths) / 3.0;

        String grade;
        String remarks;

        // Grade Decision Logic
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
        else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } 
        else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching standards";
        } 
        else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below standards";
        } 
        else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output Results
        System.out.println("\n----- Result -----");
        System.out.println("Average Percentage : " + average + "%");
        System.out.println("Grade              : " + grade);
        System.out.println("Remarks            : " + remarks);
    }
}
