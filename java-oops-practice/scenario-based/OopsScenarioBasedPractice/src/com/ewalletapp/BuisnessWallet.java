package com.ewalletapp;

//Business wallet with tax deduction
class BusinessWallet extends Wallet {
	private static final double TAX_RATE = 0.02; // 2% tax

	public BusinessWallet() {
		super();
	}

	public BusinessWallet(double referralBonus) {
		super(referralBonus);
	}

	// Polymorphic transfer logic with tax
	@Override
	public void transferTo(User receiver, double amount) {

		double tax = amount * TAX_RATE;
		double totalDeduction = amount + tax;

		if (totalDeduction > getBalance()) {
			System.out.println("Insufficient balance (including tax)");
			return;
		}

		deductBalance(totalDeduction);
		receiver.getWallet().loadMoney(amount);

		transactions.add(new Transaction("Transferred to " + receiver.getName(), amount));
		transactions.add(new Transaction("Transaction Tax", tax));
	}
}
