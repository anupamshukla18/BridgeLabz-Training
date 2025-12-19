// Program to calculate total purchase price
import java.util.Scanner;

public class PurchasePrice
{  
    public static void main(String[] args)
    {
        //declare variables
        double unitPrice;
        int quantity;
        
        Scanner input = new Scanner(System.in); //Scanner object
        
        unitPrice = input.nextDouble(); //taking unit price input
        quantity = input.nextInt();     //taking quantity input
        
        double totalPrice = unitPrice * quantity; //calculating total price
        
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice); //Display the result
    }
}