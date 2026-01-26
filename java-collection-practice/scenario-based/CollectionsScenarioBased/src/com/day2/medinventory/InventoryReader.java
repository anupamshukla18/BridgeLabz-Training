package com.day2.medinventory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class InventoryReader {

	public static Set<Item<String>> readInventory(String filePath) {

		Set<Item<String>> items = new HashSet<Item<String>>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line = reader.readLine(); // skip header

			while ((line = reader.readLine()) != null) {

				String[] data = line.split(",");

				String itemId = data[0];
				String itemName = data[1];
				int quantity = Integer.parseInt(data[2]);
				String expiryDate = data[3];

				items.add(new Item<>(itemId, itemName, quantity, expiryDate));
			}

		} catch (IOException e) {
			System.out.println("Error reading inventory file");
		}

		return items;
	}

}