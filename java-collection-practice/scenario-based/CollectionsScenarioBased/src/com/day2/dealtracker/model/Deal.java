package com.day2.dealtracker.model;

import java.time.LocalDate;

/**
 * Discount Deal class
 */
public class Deal extends Promotion<Integer> {

	private double minimumPurchase;

	public Deal(String dealCode, int discountPercentage, LocalDate validTill, double minimumPurchase) {
		super(dealCode, discountPercentage, validTill);
		this.minimumPurchase = minimumPurchase;
	}

	public int getDiscountPercentage() {
		return promotionValue;
	}

	public double getMinimumPurchase() {
		return minimumPurchase;
	}

	@Override
	public String toString() {
		return "DealCode=" + promotionCode + ", Discount=" + promotionValue + "%" + ", ValidTill=" + validTill
				+ ", MinimumPurchase=" + minimumPurchase;
	}
}