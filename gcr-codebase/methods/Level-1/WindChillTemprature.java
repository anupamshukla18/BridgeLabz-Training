import java.util.Scanner;
class WindChillTemprature {
	public static double windChill(double windSpeed, double windTemprature) {
		//Evaluating the windChill
		double windChill = 35.74 + 0.6215 * windTemprature
							+ (0.4275 * windTemprature - 35.75) * Math.pow(windSpeed, 0.16);
		
		// returning the result
		return windChill;
	}
	
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input for temprature and wind speed
		System.out.println("Enter the wind's temprature: ");
		double windTemprature = input.nextDouble();
		System.out.println("Enter the wind's speed: ");
		double windSpeed = input.nextDouble();
		
		//Displaying the result
		System.out.println("The wind chill temprature for the temprature " + windTemprature + " and wind speed " + windSpeed + " is " + windChill(windSpeed, windTemprature));
	}
}