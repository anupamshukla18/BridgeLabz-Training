package com.foreachmethod.stockpricelogger;

import java.util.*;

public class StockPriceMain {

	public static void main(String[] args) {

		List<Double> liveStockPrices = Arrays.asList(1520.50, 1532.75, 1518.20, 1540.90, 1555.10);

		StockPriceService service = new StockPriceService();

		service.logStockPrices(liveStockPrices);
	}
}
