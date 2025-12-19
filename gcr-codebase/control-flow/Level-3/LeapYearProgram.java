import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Invalid Year! Enter year >= 1582 (Gregorian Calendar).");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year");
            } 
            else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } 
            else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
    }
}
