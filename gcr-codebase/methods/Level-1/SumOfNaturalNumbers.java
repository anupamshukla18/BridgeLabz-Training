import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static int sumOfNaturalNumbers(int number){
		//storing the sum in the sum variable
		int sum = 0;
		
		//calculating the sum of the natural numbers
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		
		//returning the result
		return sum;
	}
	
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking the number from user input 
		System.out.println("Enter the nth number: ");
		int number = input.nextInt();
		
		//Displaying the result 
		System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers(number));
	}
}