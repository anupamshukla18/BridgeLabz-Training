package com.day2.medinventory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MedInventoryApp {

	public static void main(String[] args) {

		String csvFilePath = "D:\\File Handling\\CSV_Files\\inventory.csv";

		Set<Item<String>> items = InventoryReader.readInventory(csvFilePath);

		try {
			Map<String, List<Item<String>>> categorizedItems = InventoryAnalyzer.categorizeItems(items);

			categorizedItems.forEach((category, itemList) -> {
				System.out.println("\nCategory: " + category);
				itemList.forEach(System.out::println);
			});

		} catch (LowStockException e) {
			System.out.println(e.getMessage());
		}
	}
}