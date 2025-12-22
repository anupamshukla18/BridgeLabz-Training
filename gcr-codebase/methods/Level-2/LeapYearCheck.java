import java.util.Scanner;

public class LeapYearCheck {
	// Method to check Leap Year
    public static boolean isLeapYear(int year) {
        // Condition A: divisible by 4 and not by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // Condition B: divisible by 400
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Invalid Year! Leap year rule applies only for year >= 1582.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
