package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fibonacchi {

	public static void main(String[] args) {
		System.out.println(fibonachi(100));
		System.out.println(fibonachi2(100));
	}

	@Test
	/*
	 * Write a Java program to print Fibonacci series upto 100? 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34, 55, 89
	 */
	public void fibbonachi() {
		Assert.assertEquals(Fibonacchi.fibonachi2(100), "0 1 1 2 3 5 8 13 21 34 55 89");
		Assert.assertEquals(Fibonacchi.fibonachi(100), "0 1 1 2 3 5 8 13 21 34 55 89");
	}

	/*
	 * Write a Java program to print Fibonacci series upto 100? 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34, 55, 89
	 */

	public static String fibonachi(int n) {
		int n0 = 1;
		int n1 = 1;
		int n2 = 0;
		String sequence = "0 " + n0 + " " + n1;
		while (n2 < n) {
			n2 = n0 + n1;
			if (n2 < n) {
				sequence += " " + n2;
			}
			n0 = n1;
			n1 = n2;
		}
//		System.out.println();
		return sequence;
	}

	// Best solution
	public static String fibonachi2(int n) {

		int n1 = 0;
		int n2 = 1;
		int result = n1 + n2;

		String sequence = n1 + " " + n2;

		while (result < n) {
			sequence += " " + result;
			n1 = n2;
			n2 = result;
			result = n1 + n2;
		}
		return sequence;
	}

}
