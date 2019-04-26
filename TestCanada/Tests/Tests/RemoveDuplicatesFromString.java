package Tests;

import java.util.LinkedHashSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromString {

	@Test /* Remove duplicates present in the passed string */

	public void removeDuplicates() {
		String s = "Hello word!";
		String result = "";
		LinkedHashSet<Character> list = new LinkedHashSet<Character>();

		for (Character c : s.replaceAll("\\s", "").toCharArray()) {
			list.add(c);
		}
		for (Character e : list) {
			{
				result += e;
				System.out.print(e);
			}
		}

		Assert.assertEquals(result, "Helowrd!");
	}

}
