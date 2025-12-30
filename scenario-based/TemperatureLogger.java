/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

class TemperatureLogger {
	public static double maxTemperature(double[] arr) {
		//initializing a variable for storing the maxTemperature
		double maxTemperature = arr[0];
		
		//Evaluating the maximum temperature
		for (int i = 0; i < arr.length; i++) {
			if (maxTemperature < arr[i]) {
				maxTemperature = arr[i+1];
			} else {
				continue;
			}
		}
		//returning the result
		return maxTemperature;
	}
	
	public static void main(String[] args) {
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//Creating an array for storing the tempratures for 7 days
		double[] temperatureArray = new double[7];
		
		//initialising a variable for storing the sum and average
		double sum = 0.0;
		double average = 0.0;
		
		
		//taking the temprature readings of everyday in the array	
		for (int i = 0; i < temperatureArray.length; i++) {
			System.out.println("Enter the readings of the temprature for Day " + (i+1) +": ");
			temperatureArray[i] = input.nextDouble();
			sum += temperatureArray[i];
		}
		
		//calculating the average
		average = sum / temperatureArray.length;
		
		//finding the maximum temperature 
		double maxTemperature = maxTemperature(temperatureArray);
		
		//Displaying the result
		System.out.println("Average of the 7 days readings: " + average);
		System.out.println("Maximum Temprature of the 7 days readings: " + maxTemperature);
	}
}	
		
		   