// Program to find side of a square using perimeter
import java.util.Scanner;

public class SquareSide
{  
    public static void main(String[] args)
    {
        //declare variables
        double perimeter;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        perimeter = input.nextDouble(); //taking perimeter input
        
        double side = perimeter / 4; //calculating side of square
        
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter); //Display the result
    }
}