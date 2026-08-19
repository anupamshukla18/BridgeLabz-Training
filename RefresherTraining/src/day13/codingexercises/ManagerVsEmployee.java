package day13.codingexercises;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class ManagerVsEmployee {
    public static void main(String[] args) {

        Manager manager = new Manager("Anupam", 70000, 8);

        manager.getDetails();
    }
}