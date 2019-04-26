package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewspperAndNote {

	@Test
	/*
	 * There is a scoundrel who stole a dog from a neighbor. He wants to write a
	 * ransom note, cutting out words from a newspaper. The task is to write a
	 * function that accepts 2 strings (text of the newspaper, text of the note) and
	 * returns true if all the words from the note are in the text of the newspaper
	 * or false if there are not enough words cover case when words in note more
	 * than in newspaper
	 */
	public void checkNewspaperWordsLists() {
		Assert.assertEquals(checkNewspaperWordsLists("abc, de! de fg", "de? fg fg de abc"), false);
		Assert.assertEquals(checkNewspaperWordsLists("abc, de! de fg", "de? fg de abc"), true);

		Assert.assertEquals(checkNewspaperWordsHashMap("abc, de! de fg", "de? fg# fg"), false);
		Assert.assertEquals(checkNewspaperWordsHashMap("abc, de! de fg", "de? fg#"), true);

	}

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

}
