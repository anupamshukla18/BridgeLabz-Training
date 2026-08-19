package day14.hackerrankproblems;
import java.util.Scanner;

class Arithmetic {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class Adder extends Arithmetic {
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Adder adder = new Adder();

        System.out.println("My superclass is: "
                + adder.getClass().getSuperclass().getSimpleName());

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(adder.add(firstNumber, secondNumber));

        scanner.close();
    }
}