import java.util.Scanner;
class EvenOddArray {
	public static void main(String[] args) {
		//Create a Scanner object 
		Scanner input = new Scanner(System.in);
		
		//Taking the size of the main array
		System.out.print("Enter the size of the array: ");
		int num = input.nextInt();
		
		//Exit program if number < 0
		if (num < 0){
			System.out.println("Invalid Number!!");
			System.exit(0);
		}
		
		//Declaring and Initializing arrays
		int[] number = new int[num];
		int[] evenArray = new int[num / 2 + 1];
		int[] oddArray = new int[num / 2 + 1];
		
		//Filling the number's array
		System.out.print("Enter the values of the array: ");
		for (int i = 0; i < num; i++) {
			number[i] = input.nextInt();
		}
		
		//Even and odd indexes
		int evenIndex = 0;
		int oddIndex = 0;
		
		//Checking the numbers and adding them into their arrays
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				evenArray[evenIndex] = number[i];
				evenIndex++;
			} else {
				oddArray[oddIndex] = number[i];
				oddIndex++;
			}
		}
	    
		//Printing even array 
		System.out.print("Even Array: ");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		}
		
		System.out.println();
		
		//Printing odd array 
		System.out.print("Odd Array: ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i] + " ");
		}
	}
}
		