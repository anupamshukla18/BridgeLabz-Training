class ProfitLossPercentage{
	public static void main(String[] args){
		//Initializing cost price
		int costPrice = 129;
		
		//Initializing selling price
		int sellingPrice = 191;
		
		//Calculating the profit 
		int profit = sellingPrice - costPrice;
		
		//Calculating the profit percentage
		double profitPercentage = (profit / costPrice) * 100;
		
		//Displaying the final result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage+"%");
	}
}