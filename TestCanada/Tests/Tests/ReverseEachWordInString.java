package Tests;

import java.util.StringTokenizer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		System.out.println(reverseStringWithSpecialChars("Hello, World!"));
	}

	@Test
	// Reverse each word in the given string e.g "Hello, World!" -> "olleH, dlroW! "
	public void reverseStringWithSpecialChars() {
		Assert.assertEquals(ReverseEachWordInString.reverseStringWithSpecialChars("Hello, World!"), "olleH, dlroW!");
		Assert.assertEquals(ReverseEachWordInString.reverseWordSplitNotFullSolution("Hello, World! it's me"),
				"olleH, dlroW! sti' em ");
	}

	// Reverse each word in the given string e.g "Hello, World!" -> "olleH, dlroW! "

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
//			Reverse word in string with StringBuilder
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(stringOriginal, " ");
		while (st.hasMoreTokens()) {
			StringBuilder thisToken = new StringBuilder(st.nextToken());
			result.append(thisToken.reverse() + " ");
		}
		String resultString = result.toString();
		return resultString;

	}

}
