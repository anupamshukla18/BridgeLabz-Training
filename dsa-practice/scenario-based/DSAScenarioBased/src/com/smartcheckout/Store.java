package com.smartcheckout;

import java.util.*;

// Manages item price and stock
class Store {
	HashMap<String, Integer> priceMap = new HashMap<>();
	HashMap<String, Integer> stockMap = new HashMap<>();

	void addItem(String item, int price, int stock) {
		priceMap.put(item, price);
		stockMap.put(item, stock);
	}
}
