import java.util.Random;

public class EmployeeBonus {

    static final int EMPLOYEE_COUNT = 10;

    // Method to generate salary & years of service
    public static int[][] generateEmployeeData() {
        int[][] employees = new int[EMPLOYEE_COUNT][2]; 
        // col 0 -> Salary, col 1 -> Years of Service

        Random random = new Random();

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = 10000 + random.nextInt(90000); // 5 digit salary
            int years = random.nextInt(11);             // 0 to 10 years
            employees[i][0] = salary;
            employees[i][1] = years;
        }

        return employees;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[EMPLOYEE_COUNT][2];
        // col 0 -> Bonus Amount, col 1 -> New Salary

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    // Method to print table + totals
    public static void printTable(int[][] employees, double[][] updatedData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Emp No \t Salary \t Years \t Bonus \t\t New Salary");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = employees[i][0];
            int years = employees[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%d \t %d \t %d \t %.2f \t %.2f\n",
                    (i + 1), salary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Total Old Salary  = " + totalOldSalary);
        System.out.println("Total Bonus Paid  = " + totalBonus);
        System.out.println("Total New Salary  = " + totalNewSalary);
    }

    public static void main(String[] args) {

        int[][] employees = generateEmployeeData();
        double[][] updatedSalary = calculateBonus(employees);

        printTable(employees, updatedSalary);
    }
}
