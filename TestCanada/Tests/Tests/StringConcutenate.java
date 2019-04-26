package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringConcutenate {

	@Test
	public void concutStrings() {
		Assert.assertEquals(concutStrings("hello", "World"), "hWeolrllod");
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

}
