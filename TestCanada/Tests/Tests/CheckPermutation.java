package Tests;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String s = "dog";
		String t = "god";

		System.out.println(sort(s));
	}

	public static String sort(String sArr) {
		char[] cArr = sArr.toCharArray();
		Arrays.sort(cArr);
		return new String(cArr);
	}

	public boolean checkPermutation(String s, String t) {
		if (sort(s).equals(sort(s))) {

		}
		return false;
	}
}
