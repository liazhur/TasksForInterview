package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxConsecutiveNumber {

	// Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones

	public static void main(String[] args) {
//		int[] allDigits0 = { 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0 };
//		int[] allDigits1 = { 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1 };
//		System.out.println(findMax01(allDigits0));
//		System.out.println(findMax01(allDigits1));
//		findBinary(529);
		int[] enterArray = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		findMaxZeros(enterArray);
	}

	@Test
	// Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones
	public void findMaxZerosOrOnes() {
		int[] enterArray = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		int[] enterArray0 = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0 };
		int[] enterArray01 = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0 };
		Assert.assertEquals(MaxConsecutiveNumber.findMaxZerosOrOnes(enterArray), "Max is 1: 7");
		Assert.assertEquals(MaxConsecutiveNumber.findMaxOnes(enterArray), 7);
		Assert.assertEquals(MaxConsecutiveNumber.findMaxZerosOrOnes(enterArray0), "Max is 0: 6");
		Assert.assertEquals(MaxConsecutiveNumber.findMaxZerosOrOnes(enterArray01), "Equal numbers of 1 and 0");
	}

	public static String findBinary(int n) {
		n = 529;
		Integer i = new Integer(n);
		String binary = Integer.toBinaryString(i);
		System.out.println("Binary value: " + binary);
		return binary;

	}

	public static int findMaxZeros(int arr[]) {
		int resultOnes = 0;
		int onesCountInRow = 0;

		for (int i = 0; i < arr.length; i++) {

			// Reset count when 0 is found
			if (arr[i] == 0) {
				onesCountInRow = 0;
			}
			// If 1 is found, increment count and update result if count becomes more.
			else {
				onesCountInRow++;// increase count
				resultOnes = Math.max(resultOnes, onesCountInRow);
			}
		}
		System.out.println(resultOnes);
		return resultOnes;
	}

	public static int findMaxOnes(int arr[]) {
		int resultOnes = 0;
		int onesCountInRow = 0;

		for (int i = 0; i < arr.length; i++) {
			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			if (arr[i] == 1) {
				onesCountInRow++;// increase count
//				resultOnes = Math.max(resultOnes, onesCountInRow);
				if (resultOnes < onesCountInRow) {
					resultOnes = onesCountInRow;
				}
			} else {
				// Reset count when 0 is found
				onesCountInRow = 0;
			}
		}
		System.out.println(resultOnes);
		return resultOnes;
	}

	public static String findMaxZerosOrOnes(int arr[]) {
		int resultOnes = 0;
		int resultZeros = 0;
		int onesCountInRow = 0;
		int zerosCountInRow = 0;
		String result;

		for (int i = 0; i < arr.length; i++) {
			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			if (arr[i] == 1) {
				onesCountInRow++;// increase count
				zerosCountInRow = 0;
//					resultOnes = Math.max(resultOnes, onesCountInRow);
				if (resultOnes < onesCountInRow) {
					resultOnes = onesCountInRow;
				}
			} else {
				// Reset count when 0 is found
				onesCountInRow = 0;
				zerosCountInRow++;
				if (resultZeros < zerosCountInRow) {
					resultZeros = zerosCountInRow;
				}
			}
		}
		if (resultOnes < resultZeros) {
			result = "Max is 0: " + resultZeros;
		} else if (resultOnes > resultZeros) {
			result = "Max is 1: " + resultOnes;
		} else {
			result = "Equal numbers of 1 and 0";
		}
		System.out.println(result);
		return result;
	}

	public static int findMax01(int arr[]) {
		int temporaryResult = 0;
		int globalResult = 0;

		for (int i = 1; i < arr.length; i++) {
			int one = arr[i];
			int two = arr[i - 1];
			if (arr[i] == arr[i - 1]) {
				temporaryResult++;
				if (globalResult < temporaryResult) {
					globalResult = temporaryResult;
				}
			} else {
				temporaryResult = 1;
			}
		}
		return globalResult;

	}

}
