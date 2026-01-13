import java.util.Scanner;
class PositiveNegativeOrZero {
	public static void main(String[] args) {
		//Creating a Scanner object and taking the user input as well
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Checking whether the number is positive negative or zero and displaying it as well
		if (number == 0) {
			System.out.println("Zero");
		} else if (number > 0 ) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}