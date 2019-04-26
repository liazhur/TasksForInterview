package Tests;

import java.util.HashSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstRepeatingCharInString {

	public static void main(String[] args) {
		System.out.println(findFirsRepeatingCharHashSet("Hello, World! it's me"));
		System.out.println(findFirsRepeatingChar("Hello, World! it's me"));
	}

	@Test
//	Find the first repeating character in a string
//	Time Complexity of this solution is O(n2)
	public void findFirsRepeatingCharHashSet() {
		Assert.assertEquals(FirstRepeatingCharInString.findFirsRepeatingCharHashSet("Hello, World! it's me"), 'l');
		Assert.assertEquals(FirstRepeatingCharInString.findFirsRepeatingChar("Hello, World! it's me"), 'e');
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
			if (result != 0) // pay attension to stop forse loop once we found first occurence, otherwise it
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

}
