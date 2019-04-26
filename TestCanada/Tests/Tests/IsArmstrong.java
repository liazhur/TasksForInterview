package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsArmstrong {

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(407));
	}

	@Test
	/*
	 * Write a function that takes a number as input and returns true if this number
	 * is an Armstrong number or false if it is not
	 */
	public void isArmstrongNumber() {
		Assert.assertEquals(IsArmstrong.isArmstrongNumber(407), true);
	}

	/*
	 * Function that takes a number as input and returns true if this number is an
	 * Armstrong number or false if it is not
	 */
	public static boolean isArmstrongNumber(int n) {
		int temp = n;
		int digits = 0;
		int remainder;
		int sum = 0;

		// find digits
		while (temp != 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;

		while (temp != 0) {
			remainder = temp % 10;
			sum = (int) (sum + Math.pow(remainder, digits));
			temp = temp / 10;
		}

		if (sum == n) {
			return true;
		} else

			return false;

	}

	// Math.pow implementation
	static int power(int number, int power) {
		int c, p = 1;

		for (c = 1; c <= power; c++)
			p = p * number;

		return p;
	}

	static boolean isArmstrongNumb(int x) {
		int originalNumber, remainder, result = 0, n = 0;

		originalNumber = x;

		for (; originalNumber != 0; originalNumber /= 10, ++n)
			;

		originalNumber = x;

		for (; originalNumber != 0; originalNumber /= 10) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
		}

		if (result == x) {
			System.out.println(x + " is an Armstrong number.");
			return true;
		} else
			System.out.println(x + " is not an Armstrong number.");
		return false;
	}

}
