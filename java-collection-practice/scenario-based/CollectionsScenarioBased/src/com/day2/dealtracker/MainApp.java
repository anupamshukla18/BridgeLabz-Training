package com.day2.dealtracker;

import com.day2.dealtracker.model.Deal;
import com.day2.dealtracker.tracker.DealTracker;

import java.util.List;

/**
 * Application entry point
 */
public class MainApp {

	public static void main(String[] args) {

		String path = "D:\\Desktop\\FileHandling\\Deal.txt"; // place in project root

		List<Deal> deals = DealTracker.processDeals(path);

		System.out.println("---- VALID DEALS ----");
		for (Deal d : deals) {
			System.out.println(d);
		}
	}
}