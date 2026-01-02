package com.ewalletapp;

class PersonalWallet extends Wallet {
	private static final double TRANSFER_LIMIT = 5000;

	public PersonalWallet() {
		super();
	}

	public PersonalWallet(double referralBonus) {
		super(referralBonus);
	}

	// Polymorphic transfer logic
	@Override
	public void transferTo(User receiver, double amount) {

		if (amount > TRANSFER_LIMIT) {
			System.out.println("Transfer limit exceeded for Personal Wallet");
			return;
		}

		if (amount > getBalance()) {
			System.out.println("Insufficient balance");
			return;
		}

		deductBalance(amount);
		receiver.getWallet().loadMoney(amount);

		transactions.add(new Transaction("Transferred to " + receiver.getName(), amount));
	}
}
