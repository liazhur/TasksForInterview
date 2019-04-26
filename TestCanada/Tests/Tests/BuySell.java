package Tests;

import java.util.ArrayList;
import java.util.HashMap;

class BuySell {
	int buy, sell;

	public static void main(String[] args) {

		StockBuySell2 stock = new StockBuySell2();
		int[] price = { 55, 68, 72, 99, 30, 124, 235 };
		int n = price.length;

		// fucntion call
		stock.stockBuySell(price, n);
	}
}

class StockBuySell2 {
	// This function finds the buy sell schedule for maximum profit
	void stockBuySell(int price[], int n) {
		// Prices must be given for at least two days
		if (n == 1)
			return;

		int count = 0;

		// solution array
		ArrayList<BuySell> sol = new ArrayList<BuySell>();
		HashMap<BuySell, Integer> map = new HashMap<BuySell, Integer>();

		// Traverse through given price array
		int i = 0;
		while (i < n - 1) {
			// Find Local Minima. Note that the limit is (n-2) as we are
			// comparing present element to the next element.
			while ((i < n - 1) && (price[i + 1] <= price[i]))
				i++;

			// If we reached the end, break as no further solution possible
			if (i == n - 1)
				break;

			BuySell e = new BuySell();
			e.buy = i++ + 1;
			// Store the index of minima

			// Find Local Maxima. Note that the limit is (n-1) as we are
			// comparing to previous element
			while ((i < n) && (price[i] >= price[i - 1]))
				i++;

			// Store the index of maxima
			e.sell = i;
			sol.add(e);

			// Increment number of buy/sell
			count++;
		}

		// print solution
		if (count == 0)
			System.out.println("There is no day when buying the stock " + "will make profit");
		else
			for (int j = 0; j < count; j++) {
				System.out.println("Buy on day: " + sol.get(j).buy + "    " + "Sell on day : " + sol.get(j).sell);
			}
		return;
	}

	public static int findMax(int[] arr) {

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
		return max;
	}

}