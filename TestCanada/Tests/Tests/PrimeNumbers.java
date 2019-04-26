package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumbers {

	public static void main(String[] args) {
		findPrimes(23);
	}

	@Test
	public void testPrimes() {
		Assert.assertEquals(findPrimes(23), " 2 3 5 7 11 13 17 19 23");
	}

	/*
	 * Print all prime numbers less than the supplied number
	 */
	public static String findPrimes(int n) {
		String s = "";
		for (int i = 1; i <= n; i++) {
			if (isPrime(i))
				s += " " + i;
		}
		return s;
	}

	public static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;

	}

	// another solution to verify is prime
	public boolean prime(int number) {

		boolean result = false;

		if (number == 0 || number == 1 || number == 2) {
			result = true;
			System.out.println(result);

		} else
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					System.out.println(result);
					break;
				}
			}
		result = true;
		System.out.println(result);
		return result;

	}

}
