import java.util.Scanner;
class HeightsMean {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Declaring and Initializing an array of heights 
		double[] heights = new double[11];
		
		double mean;				// for storing mean
		double sum = 0;             // for calculating the sum
		int count = heights.length; // total number of elements		
		
		//taking the heights of the players 
		System.out.print("Enter the height of the players: ");
		for (int i = 0; i < count; i++) {
			heights[i] = input.nextInt();
		}
		
		//Calculating the sum of the heights
		for(int i = 0; i < count; i++){
			sum += heights[i];
		}
		
		//Calculating the mean of the player's height
		mean = sum / count;
		
		//Displaying the result
		System.out.print("Mean of players heights: " + mean);
	}
}	