// Program to convert distance from feet to yards and miles
import java.util.Scanner;

public class DistanceConversion
{  
    public static void main(String[] args)
    {
        //declare variables
        double distanceInFeet;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        distanceInFeet = input.nextDouble(); //taking distance input
        
        double yards = distanceInFeet / 3;      //converting feet to yards
        double miles = yards / 1760;             //converting yards to miles
        
        System.out.println("The distance in yards is " + yards +
                           " and in miles is " + miles); //Display the result
    }
}