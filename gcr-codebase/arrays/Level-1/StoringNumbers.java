import java.util.Scanner;
class StoringNumbers {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		 
		double[] number = new double[10]; // Array with the maximum capacity of 10
		double total = 0.0;            // variable to store total
		int index = 0;                 // Index of the array
		
		//Infinite loop input to store numbers
		while (true) {
			System.out.print("Enter the number (0 or negative to end): ");
			double value = input.nextInt();
			
			// Stop if the value <= 0
			if (value == 0) {
				break;
			}
			
			// Stop if the array is full
			if (index == 10) {
				System.out.println("Array is full, no more values can be added!!");
				break;
			}
			
			//Store the values to the array
			number[index] = value;
			index++;
		}
		
		//calculating the sum of the array
		int sum = 0; //For storing the sum
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		
		//Displaying the total value
		System.out.println("Total sum of the array: " + sum);
	}
}
		
		
		
		