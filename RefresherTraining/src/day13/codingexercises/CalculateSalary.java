package day13.codingexercises;

class SalaryCalculator {
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    double calculateSalary(double basicSalary, double bonus, double deduction) {
        return basicSalary + bonus - deduction;
    }
}

public class CalculateSalary {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println(calculator.calculateSalary(30000));

        System.out.println(calculator.calculateSalary(30000, 5000));

        System.out.println(calculator.calculateSalary(30000, 5000, 2000));
    }
}