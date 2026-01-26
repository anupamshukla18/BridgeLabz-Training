package com.day2.dealtracker.validator;

import com.day2.dealtracker.model.Deal;

import java.time.LocalDate;

/**
 * Validates deals
 */
public class DealValidator {

	public static boolean isExpired(Deal deal) {
		return deal.getValidTill().isBefore(LocalDate.now());
	}

	public static boolean isValidDiscount(Deal deal) {
		int discount = deal.getDiscountPercentage();
		return discount > 0 && discount <= 90;
	}
}