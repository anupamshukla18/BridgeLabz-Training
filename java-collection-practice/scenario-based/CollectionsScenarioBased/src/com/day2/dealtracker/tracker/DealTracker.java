package com.day2.dealtracker.tracker;

import com.day2.dealtracker.model.Deal;
import com.day2.dealtracker.parser.DealParser;
import com.day2.dealtracker.reader.DealFileReader;
import com.day2.dealtracker.validator.DealValidator;

import java.util.*;

/**
 * Core DealTracker logic
 */
public class DealTracker {

	public static List<Deal> processDeals(String filePath) {

		Map<String, Deal> dealMap = new HashMap<>();
		Set<String> seenDealCodes = new HashSet<>();

		try {
			String content = DealFileReader.readFile(filePath);

			// Split deals by empty line
			String[] dealBlocks = content.split("\\n\\n");

			for (String block : dealBlocks) {

				Deal deal = DealParser.parseDeal(block);

				if (seenDealCodes.contains(deal.getPromotionCode()))
					continue;

				if (DealValidator.isExpired(deal))
					continue;

				if (!DealValidator.isValidDiscount(deal))
					continue;

				seenDealCodes.add(deal.getPromotionCode());
				dealMap.put(deal.getPromotionCode(), deal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Deal> deals = new ArrayList<>(dealMap.values());

		// Sort by highest discount
		deals.sort(Comparator.comparingInt(Deal::getDiscountPercentage).reversed());

		return deals;
	}
}