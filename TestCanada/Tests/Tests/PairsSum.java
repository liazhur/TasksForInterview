package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PairsSum {

	@Test
	public void findNumberOfPairsSum() {
		int[] arr = { 1, 5, 7, -1, 5 };
		Assert.assertEquals(findNumberOfPairsSum(arr, 6), 3);
	}

	/*
	 * find pairs of elements from an array which sum to a specified value. -> Given
	 * an array of integers, and a number ‘sum’, find the number of pairs of
	 * integers in the array whose sum is equal to ‘sum’.
	 */
	public static int findNumberOfPairsSum(int[] arr, int sum) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {

					count++;
				}

			}
		}
		return count;

	}

}
