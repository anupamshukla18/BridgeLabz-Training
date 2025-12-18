import java.util.Scanner;
class NaturalNumbers {
	public static void main(String[] args) {
		//Creating a Scanner object and taking user input
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Logic of sum
		int sum = 0;
		for (int i = 1; i <= number; i++){
			int result = number * (number + 1) / 2;
			sum += result;
		}
		
		//Displaying the result
		if (number < 0) {
			System.out.println("The number " + number + " is not a natural number ");
 		} else {
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
	}
}