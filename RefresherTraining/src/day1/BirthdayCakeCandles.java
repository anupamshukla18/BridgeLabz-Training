package day1;

import java.util.*;

class BirthdayCandlesResult {

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
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
		int result = BirthdayCandlesResult.birthdayCakeCandles(candles);

		// Print the result
		System.out.println(result);

		sc.close();
	}
}