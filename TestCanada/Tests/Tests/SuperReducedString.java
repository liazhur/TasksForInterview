package Tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SuperReducedString {

	public static void main(String[] args) {
		String s = "aa";
		superReducedString(s);

	}

	static String superReducedString(String s) {
		String res = "";
		char[] sArr = s.toCharArray();
		ArrayList<Character> result = new ArrayList<Character>();
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (Character c : sArr)
			if (hashMap.get(c) == null)
				hashMap.put(c, 1);
			else
				hashMap.put(c, hashMap.get(c) + 1);

		for (HashMap.Entry<Character, Integer> item : hashMap.entrySet()) {
			if (item.getValue() % 2 != 0) {
				result.add(item.getKey());
			}
		}

		if (result.size() == 0) {
			System.out.print("Empty String");
			res = "Empty String";
		}

		for (Character c : result) {

			System.out.print(c);
			res += c;
		}

		return res;
	}
}
