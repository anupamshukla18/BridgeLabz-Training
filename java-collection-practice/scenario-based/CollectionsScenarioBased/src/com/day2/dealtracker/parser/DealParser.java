package com.day2.dealtracker.parser;

import com.day2.dealtracker.model.Deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Parses deal text using Regex
 */
public class DealParser {

	private static final Pattern DEAL_CODE = Pattern.compile("DealCode:\\s*(\\w+)");
	private static final Pattern DISCOUNT = Pattern.compile("Discount:\\s*(\\d+)%");
	private static final Pattern VALID_TILL = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
	private static final Pattern MIN_PURCHASE = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

	public static Deal parseDeal(String text) throws Exception {

		String code = extract(DEAL_CODE, text);
		int discount = Integer.parseInt(extract(DISCOUNT, text));
		double minPurchase = Double.parseDouble(extract(MIN_PURCHASE, text));

		String dateStr = extract(VALID_TILL, text);
		LocalDate validTill = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

		return new Deal(code, discount, validTill, minPurchase);
	}

	private static String extract(Pattern pattern, String text) throws Exception {
		Matcher matcher = pattern.matcher(text);
		if (matcher.find()) {
			return matcher.group(1);
		}
		throw new Exception("Invalid deal format");
	}
}