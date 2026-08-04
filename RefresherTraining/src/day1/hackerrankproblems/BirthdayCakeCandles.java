package day1.hackerrankproblems;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BirthdayCakeCandles {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Read the number of candles
		int candlesCount = sc.nextInt();

		// Read the candle heights
		List<Integer> candles = new ArrayList<>();

		for (int i = 0; i < candlesCount; i++) {
			candles.add(sc.nextInt());
		}

		// Call the function
		int result = birthdayCakeCandles(candles);

		// Print the result
		System.out.println(result);

		sc.close();
	}
	public static int birthdayCakeCandles(List<Integer> candles) {
		int tallestCandle = 0;
		
		for (int candle : candles) {
			if (candle > tallestCandle)
				tallestCandle = candle;
			continue;
		}
		
		int countOfTallestCandles = 0;
		
		for (int candle : candles) {
			if (candle == tallestCandle)
				countOfTallestCandles++;
			continue;
		}
		
		return countOfTallestCandles;
	}
}