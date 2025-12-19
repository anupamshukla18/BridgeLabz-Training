import java.util.Scanner;
class NumberCheck {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring and initializing an array
		int[] numbers = new int[5];
		
		//Taking the input of the numbers
		System.out.print("Enter the numbers whose checking is to be done: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		//Checking whether number is positive negative or zero
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) { //If the number is positive
				System.out.print(numbers[i] + " is positive and ");
				
				//Checking whether the number is even or odd and displaying it as well
				if (numbers[i] % 2 == 0){
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
			} else if (numbers[i] < 0) { // If the number is negative
				System.out.println(numbers[i] + " is negative");
			} else { //If the number is zero
				System.out.println(numbers[i] + " is zero");
			}
		}
	}
}