import java.util.Random;
import java.util.Scanner;
public class StudentVotingEligibility {
    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;   // generates 10 to 99
        }

        return ages;
    }

    // Method to check voting eligibility and return 2D result
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "False (Invalid Age)";
            } else if (age >= 18) {
                result[i][1] = "True (Can Vote)";
            } else {
                result[i][1] = "False (Cannot Vote)";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-20s\n", "Age", "Can Vote?");
        System.out.println("-----------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-20s\n", arr[i][0], arr[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (ex: 10): ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] result = checkVotingEligibility(ages);

        System.out.println("\n--- Voting Eligibility Result ---");
        displayTable(result);
    }
}
