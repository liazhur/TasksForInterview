package Tests;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class FindWordsInString {

	/*
	 * There is String s = "ahellowerror"; There is method isWord(String s) that
	 * returns true if s is word. Write method to return all possible words from
	 * string s in a list e.g: ["a", "hello", "lower", "we", "or", "error"]
	 */

	private static final Set<String> dictionary = new TreeSet<String>();
	static {
		dictionary.add("a");
		dictionary.add("he");
		dictionary.add("hello");
		dictionary.add("lower");
		dictionary.add("we");
		dictionary.add("error");
		dictionary.add("or");
		dictionary.add("foo");
		dictionary.add("bar");
	}

	private FindWordsInString() {
	}

	/**
	 * Returns set of valid words given an input string. It eliminates duplicates.
	 * 
	 * @param str The input string whose valid words need to be found out.
	 * @return List of valid words nested in the string.
	 */
	public static Set<String> findValidStrings(String str) {
		if (str.length() == 0) {
			throw new IllegalArgumentException("Strings of length 0 are illegal");
		}

		final Set<String> validWords = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < str.length(); j++) {
				sb.append(str.charAt(j)); // O(1) complexity.
				if (dictionary.contains(sb.toString())) {
					validWords.add(sb.toString());
				}
			}
		}
		return validWords;
	}
}

class DictionartValidWordTest {

	@Test
	public void testValidWords() {
		Set<String> expectedSet = new HashSet<String>(Arrays.asList("a", "he", "hello", "lower", "we", "error", "or"));
		assertEquals(expectedSet, FindWordsInString.findValidStrings("ahellowerror"));
	}
}
