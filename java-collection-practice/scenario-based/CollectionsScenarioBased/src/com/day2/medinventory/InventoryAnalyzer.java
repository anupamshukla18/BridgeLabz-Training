package com.day2.medinventory;

import java.util.*;

public class InventoryAnalyzer {

	public static Map<String, List<Item<String>>> categorizeItems(Set<Item<String>> items) throws LowStockException {

		Map<String, List<Item<String>>> categorizedItems = new HashMap<>();

		for (Item<String> item : items) {

			if (!ExpiryDateValidator.isValidFormat(item.getExpiryDate())) {
				continue;
			}

			if (item.getQuantity() < 10) {
				throw new LowStockException("Critical low stock: " + item.getItemName());
			}

			categorizedItems.computeIfAbsent(item.getItemName(), k -> new ArrayList<>()).add(item);
		}

		return categorizedItems;
	}
}