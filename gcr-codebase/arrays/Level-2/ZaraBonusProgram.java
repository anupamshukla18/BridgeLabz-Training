import java.util.Scanner;

public class ZaraBonusProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];

        double[] bonusAmount = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // -------- INPUT LOOP --------
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double sal = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = input.nextDouble();

            // Validate input
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid Input! Salary must be > 0 and years cannot be negative.");
                i--;    // decrement index to re-enter for same employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // -------- BONUS & TOTAL CALCULATION LOOP --------
        for (int i = 0; i < EMP_COUNT; i++) {

            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;   // 5% Bonus
            } else {
                bonusAmount[i] = salary[i] * 0.02;   // 2% Bonus
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            // Add to totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // -------- OUTPUT --------
        System.out.println("\n-----------------------------------------------");
        System.out.println("Employee Wise Bonus and Salary Details");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonusAmount[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\n-----------------------------------------------");
        System.out.println("Total Old Salary of Employees : " + totalOldSalary);
        System.out.println("Total Bonus Payout            : " + totalBonus);
        System.out.println("Total New Salary After Bonus  : " + totalNewSalary);
        System.out.println("-----------------------------------------------");
    }
}
