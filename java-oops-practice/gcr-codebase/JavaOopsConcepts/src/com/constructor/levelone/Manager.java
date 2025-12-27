package com.constructor.levelone;

public class Manager extends Employee {

    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void showManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID : " + employeeID);     // public → accessible
        System.out.println("Department  : " + department);     // protected → accessible
        System.out.println("Salary      : ₹" + getSalary());   // private → via getter
        System.out.println("Team Size   : " + teamSize);
        System.out.println("--------------------------------");
    }
}
