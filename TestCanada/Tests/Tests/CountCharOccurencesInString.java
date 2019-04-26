package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountCharOccurencesInString {

	@Test
	// Returns the number of occurences of a given character in a String
	public void numberOccurences() {
		Assert.assertEquals(CountCharOccurencesInString.numberOccurences("Hello, World! it's me o o o", 'o'), 5);
	}

	public static void main(String[] args) {
		System.out.println(numberOccurences("Hello, World! it's me o o o", 'o'));
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

}
