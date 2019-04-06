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
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	/*
	 * 2. Write a function that takes a number as input and returns true if this
	 * number is an Armstrong number or false if it is not
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

	// 3. Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones

	public static int findMaxZerosOrOnes(int arr[]) {
		int resultOnes = 0;
		int onesCountInRow = 0;

		for (int i = 0; i < arr.length; i++) {

			// Reset count when 0 is found
			if (arr[i] == 0) {
				onesCountInRow = 0;
			}

			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			else {
				onesCountInRow++;// increase count
				resultOnes = Math.max(resultOnes, onesCountInRow);
			}
		}
		System.out.println(resultOnes);

		return resultOnes;

	}

}
