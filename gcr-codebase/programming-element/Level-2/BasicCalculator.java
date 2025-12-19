import java.util.Scanner;
class BasicCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		//Displaying the result
		System.out.println("The addtion, subtraction, multiplication and division values of 2 numbers " + number1 + " and "+ number2 + " is " + addition +", "+ subtraction + ", "+ multiplication + ", " + "and "+ division );
	}
}
		