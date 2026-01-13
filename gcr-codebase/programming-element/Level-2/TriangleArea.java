// Program to calculate area of a triangle
import java.util.Scanner;

public class TriangleArea
{  
    public static void main(String[] args)
    {
        //declare variables
        double base;
        double height;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        base = input.nextDouble();   //taking base input
        height = input.nextDouble(); //taking height input
        
        double areaSquareInches = 0.5 * base * height; //calculating area in square inches
        double areaSquareCm = areaSquareInches * 6.4516; //converting to square centimeters
        
        System.out.println("The area of triangle in square inches is " + areaSquareInches +
                           " and in square centimeters is " + areaSquareCm); //Display the result
    }
}