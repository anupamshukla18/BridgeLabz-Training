import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        // Check years of service
        if (years > 5) {
            double bonus = salary * 0.05;   // 5% bonus
            System.out.println("Employee is eligible for bonus.");
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("Employee is NOT eligible for bonus.");
            System.out.println("Years of service must be more than 5 years.");
        }
    }
}
