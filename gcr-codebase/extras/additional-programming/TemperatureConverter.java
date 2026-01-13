import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fResult = celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + fResult);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double cResult = fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in Celsius: " + cResult);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
