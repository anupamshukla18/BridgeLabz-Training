import java.util.Scanner;
public class StudentFeeDiscount {
    public static void main(String[] args) {
		//Declaring and Initializing values for variables
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();;
        double discountPercent = input.nextDouble();

        // Calculating discount amount and final fee after discount
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Displaying the discount and final fee
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}




