package Tests;

public class ReplaceConsecutiveNumbers {

	public static void main(String[] args) {
		getReplacedonsecutiveNumbers(24);
	}

	/*
	 * Write a function that, given a positive integer N, prints the consecutive
	 * numbers from 1 to N, each on a separate line. However, any number divisible
	 * by 2,3 or 5 should be replaced by the word Codility,Test or Coders
	 * respectively.
	 */

	public static void getReplacedonsecutiveNumbers(int N) {
		for (int i = 1; i <= N; i++) {
			if ((i % 30 == 0)) {
				System.out.println("CodilityTestCoders");
			} else if ((i % 15 == 0)) {
				System.out.println("TestCoders");
			} else if ((i % 10 == 0)) {
				System.out.println("CodilityCoders");
			} else if ((i % 6 == 0)) {
				System.out.println("CodilityTest");
			} else if (i % 2 == 0) {
				System.out.println("Codility");
			} else if (i % 3 == 0) {
				System.out.println("Test");
			} else if (i % 5 == 0) {
				System.out.println("Coders");
			} else
				System.out.println(i);
		}
	}
}