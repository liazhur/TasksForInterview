package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PercentageRange {

	static double[] numbers = { 0.1, 0.22, 0.45, 0.61, 0.2 };

	public static void main(String[] args) {
		System.out.print(determineNumbersPercentageRange(90, numbers));
	}

	@Test
	public void percentageRangeTest() {
		Assert.assertTrue(determineNumbersPercentageRange(90, numbers));
		Assert.assertTrue(determineNumbersPercentageRange(80, numbers));
		Assert.assertFalse(determineNumbersPercentageRange(50, numbers));
		Assert.assertFalse(determineNumbersPercentageRange(10, numbers));
	}

	/*
	 * Write a function that will determine if a set of numbers are all within a
	 * specified % of each other.
	 */
	public static boolean determineNumbersPercentageRange(int percentage, double[] numbers) {

		boolean result = false;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (Math.abs(numbers[j] - numbers[i]) > numbers[i] * percentage * 0.01) {
					System.out.println("Diff " + (numbers[j] - numbers[i]));
					System.out.println("percentage " + numbers[i] * (percentage * 0.01));
					result = false;
					break;
				} else
					result = true;
			}

		}
		return result;
	}

}
