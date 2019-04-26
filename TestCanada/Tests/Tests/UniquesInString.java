package Tests;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniquesInString {

	public static void main(String[] args) {
		String str = "Hello word!";
		printUniqueFromString(str);
		printUniqueFromString2();
		printUniqueFromStringBestSolution(str);
	}

	@Test
	public void findUniqueFromString() {
		Assert.assertEquals(printUniqueFromString("Hello word!"), "Hewrd!");
		Assert.assertEquals(printUniqueFromStringBestSolution("Hello word!"), "Hewrd!");
	}

	/* Print duplicates present in the passed string */
	public static String printUniqueFromStringBestSolution(String s) {
		String result = "";
		LinkedHashMap<Character, Integer> list = new LinkedHashMap<Character, Integer>();

		for (Character c : s.replaceAll("\\s", "").toCharArray()) {
			if (list.containsKey(c)) {
				list.put(c, list.get(c) + 1);
			} else {
				list.put(c, 1);
			}
		}
		for (Map.Entry e : list.entrySet()) {
			if ((int) e.getValue() == 1) {
				result += e.getKey();
				System.out.print(e.getKey());
			}
		}

		return result;
	}

	public static String printUniqueFromString(String str) {

		final int NO_OF_CHARS = 256;
		String result = "";
		int[] count = new int[NO_OF_CHARS];

		/* Count array with frequency of characters */
		int i;
		for (i = 0; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;
		int n = i;

		// Print characters having count more than 0
		for (i = 0; i < n; i++)
			if (count[(int) str.charAt(i)] == 1) {
				System.out.print(str.charAt(i));
				result += str.charAt(i);
			}
		return result;
	}

	public static void printUniqueFromString2() {

		String str = "Hello word!";
		int n = str.length();

		int MAX_CHAR = 256;
		int[] count = new int[MAX_CHAR];

		int[] index = new int[MAX_CHAR];

		for (int i = 0; i < MAX_CHAR; i++) {
			count[i] = 0;
			index[i] = n; // A value more than any
							// index in str[]
		}

		// Traverse the input string
		for (int i = 0; i < n; i++) {
			char x = str.charAt(i);
			++count[x];

			// If this is first occurrence, then set
			// value in index as index of it.
			if (count[x] == 1 && x != ' ')
				index[x] = i;

			// If character repeats, then remove it
			// from index[]
			if (count[x] == 2)
				index[x] = n;
		}

		// Since size of index is constant, below
		// operations take constant time.
		Arrays.sort(index);

		for (int i = 0; i < MAX_CHAR && index[i] != n; i++)
			System.out.print(str.charAt(index[i]));
	}

}
