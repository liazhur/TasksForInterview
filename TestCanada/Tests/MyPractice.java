package Tests;

import java.util.HashSet;
import java.util.StringTokenizer;

public class MyPractice {

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

//Reverse each word in the given string e.g "Hello, World!" -> "olleH, dlroW! "

	// wrong solution? it gives -> ",olleH !dlroW" - , and ! missplaced
	public static String reverseWordSplitNotFullSolution(String stringOriginal) {
		String[] words = stringOriginal.split(" ");
		StringBuilder rewersedString = new StringBuilder();
		String specialSymbol = "";

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder();

			for (int j = word.length() - 1; j >= 0; j--) {
				if (Character.toString(word.charAt(j)).matches("[^a-z A-Z0-9]")) {
					specialSymbol = Character.toString(word.charAt(j));
				} else
					reversedWord.append(word.charAt(j));
			}
			rewersedString.append(reversedWord).append(specialSymbol).append(' ');
			specialSymbol = "";
		}
		return rewersedString.toString();
	}

	// reverses punctuation also
	public static String reverseStringWithSpecialChars(String stringOriginal) {
//		Reverse word in string with StringBuilder
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(stringOriginal, " ");
		while (st.hasMoreTokens()) {
			StringBuilder thisToken = new StringBuilder(st.nextToken());
			result.append(thisToken.reverse() + " ");
		}
		String resultString = result.toString();
		return resultString;

	}

// Returns the number of occurences of a given character in a String
	public static int numberOccurences(String text, char character) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				count++;
			}
			{
				if (text == null || text.length() == 0 || character == 0)
					return -1;
			}
		}
		return count;

	}

//	Find the first repeating character in a string
//	Time Complexity of this solution is O(n2)
	public static char findFirsRepeatingChar(String text) {
		char c;
		char result = 0;
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);

			for (int j = i + 1; j < text.length(); j++) {
				if (c == text.charAt(j)) {
					result = c;
					break;
				}
			}
			if (result != 0) // pay attension to stop forst loop once we found first occurence, otherwise it
								// will proceed
				break;
		}
		return result;
	}

	public static char findFirsRepeatingCharHashSet(String text) {
		// Creates an empty hashset
		HashSet<Character> h = new HashSet<>();
		char[] textArr = text.toCharArray();

		// Traverse the input array from left to right
		for (int i = 0; i <= textArr.length - 1; i++) {
			char c = textArr[i];

			// If element is already in hash set, update x
			// and then break
			if (h.contains(c))
				return c;

			else // Else add element to hash set
				h.add(c);
		}

		return '\0';
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

	/*
	 * Write a java program to alternatively contact 2 strings: Given 2 strings,
	 * merge them in an alternate way, i.e. the final string’s first character is
	 * the first character of the first string, the second character of the final
	 * string is the first character of the second string and so on. And if once you
	 * reach end of one string while if another string is still remaining then
	 * append the remaining of that string to final string
	 */
	public static String concutStrings(String s1, String s2) {
		StringBuilder finalString = new StringBuilder();

		/* append character to final string from the two strings */
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {

			finalString.append(s1.charAt(i++));
			finalString.append(s2.charAt(j++));
		}

		/*
		 * check if both the strings are traversed and if not then append remainder of
		 * that string to the final string
		 */
		if (i != s1.length()) {
			finalString.append(s1.substring(i));
		}
		if (j != s2.length()) {
			finalString.append(s2.substring(j));
		}
		return finalString.toString();
	}

	/*
	 * 3.write a java program to parse jason api by given url end point
	 */

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

	/*
	 * Write a function that will determine if a set of numbers are all within a
	 * specified % of each other.
	 */
}