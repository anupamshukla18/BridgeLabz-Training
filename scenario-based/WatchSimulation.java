/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

class WatchSimulation {
	public static void main(String[] args) {
		
		//label for breaking the outer loop
		watch: 
		
		//using loop for printing and stopping the loop
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				System.out.printf("%02d:%02d%n", hour, minute);
				//condition for cutting down the power of the watch
				if (hour == 13 && minute== 0){
					System.out.println("The watch's power is cut!!");
					break watch;
				}
			}
		}
	}
}