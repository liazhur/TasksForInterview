package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestsInterview {

	/*
	 * 1. There is a scoundrel who stole a dog from a neighbor. He wants to write a
	 * ransom note, cutting out words from a newspaper. The task is to write a
	 * function that accepts 2 strings (text of the newspaper, text of the note) and
	 * returns true if all the words from the note are in the text of the newspaper
	 * or false if there are not enough words cover case when words in note more
	 * than in newspaper
	 */

	public static boolean checkNewspaperWordsHashMap(String newspp, String note) {
		boolean result = false;
		String[] newspWords = newspp.toLowerCase().split("\\W+");
		String[] noteWords = note.toLowerCase().split("\\W+");

		// Create map for Newspaper and store duplicates quantity
		HashMap<String, Integer> newspaperMap = new HashMap<String, Integer>();
		for (String word : newspWords) {
			if (newspaperMap.get(word) == null) {
				newspaperMap.put(word, 1);
			} else {
				newspaperMap.put(word, newspaperMap.get(word) + 1);
			}
		}

		for (String noteWord : noteWords) {
			if (newspaperMap.get(noteWord) == null) {
				newspaperMap.put(noteWord, -1);
			} else {
				newspaperMap.put(noteWord, newspaperMap.get(noteWord) - 1);
			}
		}

		for (HashMap.Entry<String, Integer> wordItem : newspaperMap.entrySet()) {
			if (wordItem.getValue() < 0) {
				// Not enough words in Newspaper
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}

	public static boolean checkNewspaperWordsLists(String newspp, String note) {
		boolean result = false;

		ArrayList<String> newsppList = new ArrayList<String>(Arrays.asList(newspp.toLowerCase().split("\\W+")));
		ArrayList<String> noteList = new ArrayList<String>(Arrays.asList(note.toLowerCase().split("\\W+")));

		for (String wordFromNote : noteList) {
			if (newsppList.contains(wordFromNote)) {
				newsppList.remove(wordFromNote);
				result = true;
			} else
				return false;
		}
		return result;
	}

	/*
	 * Write a function that takes a number as input and returns true if this number
	 * is an Armstrong number or false if it is not
	 */

	static boolean isArmstrongNumber(int x) {
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

	public static boolean isArmstrongNumber2(int n) {// 407
		int sum = 0, remainder, digits = 0,

				temp = n;

		while (temp != 0) {
			digits++; // find power 3
			temp = temp / 10;
		}

		temp = n;

		while (temp != 0) {
			remainder = temp % 10; // 7 0 4
			sum += power(remainder, digits); // 7 in power 3 0 in 3 4 in 3
			temp = temp / 10;
		}
		if (n == sum) // Armstrong number
			return true;
		else // Not Armstrong number
			return false;
	}

	static int power(int number, int power) {
		int c, p = 1;

		for (c = 1; c <= power; c++)
			p = p * number;

		return p;
	}

	// 3. Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones

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
			result = "Max is 0: " + String.valueOf(resultZeros);
		} else if (resultOnes > resultZeros) {
			result = "Max is 1: " + String.valueOf(resultOnes);
		} else {
			result = "Equal numbers of 1 and 0";
		}
		System.out.println(result);
		return result;
	}

}
