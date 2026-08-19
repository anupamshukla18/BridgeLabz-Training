package day14.hackerrankproblems;
import java.util.Scanner;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate() {

        int totalScore = 0;

        for (int score : testScores) {
            totalScore += score;
        }

        int averageScore = totalScore / testScores.length;

        if (averageScore >= 90) {
            return 'O';
        } else if (averageScore >= 80) {
            return 'E';
        } else if (averageScore >= 70) {
            return 'A';
        } else if (averageScore >= 55) {
            return 'P';
        } else if (averageScore >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();

        int numberOfScores = scanner.nextInt();

        int[] testScores = new int[numberOfScores];

        for (int index = 0; index < numberOfScores; index++) {
            testScores[index] = scanner.nextInt();
        }

        Student student = new Student(
                firstName,
                lastName,
                idNumber,
                testScores
        );

        student.printPerson();
        System.out.println("Grade: " + student.calculate());

        scanner.close();
    }
}