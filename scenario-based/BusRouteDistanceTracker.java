/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;        // to store total distance travelled
        int distancePerStop = 2;      // assume each stop adds 2 km
        String choice;

        while (true) {
            // bus reaches next stop
            totalDistance += distancePerStop;
            System.out.println("Bus reached next stop. Distance traveled so far: " 
                               + totalDistance + " km");

            // ask passenger
            System.out.print("Do you want to get off? (yes/no): ");
            choice = sc.next().toLowerCase();

            if (choice.equals("yes")) {
                break;  // exit loop
            }
        }

        System.out.println("You finally got off the bus.");
        System.out.println("Total distance traveled: " + totalDistance + " km");

        sc.close();
    }
}
