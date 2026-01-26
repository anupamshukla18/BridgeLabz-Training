package com.day2.dealtracker.model;

import java.time.LocalDate;

/**
 * Generic Promotion base class
 */
public class Promotion<T> {

	protected String promotionCode;
	protected T promotionValue;
	protected LocalDate validTill;

	public Promotion(String promotionCode, T promotionValue, LocalDate validTill) {
		this.promotionCode = promotionCode;
		this.promotionValue = promotionValue;
		this.validTill = validTill;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public T getPromotionValue() {
		return promotionValue;
	}

	public LocalDate getValidTill() {
		return validTill;
	}
}