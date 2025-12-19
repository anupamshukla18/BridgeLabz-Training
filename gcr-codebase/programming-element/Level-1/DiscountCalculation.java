public class DiscountCalculation {
    public static void main(String[] args) {
		//Initializing fee
        int fee = 125000;
		
		//Initializing ppercentage of discount
        int discountPercent = 10;

		//Calculating discount
        int discount = (fee * discountPercent) / 100;
		
		//Calculating Final fee
        int finalFee = fee - discount;
		
		//Displaying the final result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
