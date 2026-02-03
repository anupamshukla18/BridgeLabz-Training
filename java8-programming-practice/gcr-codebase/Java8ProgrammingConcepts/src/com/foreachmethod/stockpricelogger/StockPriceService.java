package com.foreachmethod.stockpricelogger;

import java.util.*;

public class StockPriceService {

	public void logStockPrices(List<Double> prices) {

		prices.stream().forEach(price -> System.out.println("Stock Price Update: ₹" + price));
	}
}
