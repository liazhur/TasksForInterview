package Tests;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print(isPalendrome("123421"));
	}

	/*
	 * You are given a word. Now, using your favorite programming language, write a
	 * code to test if the word that is given to you is a palindrome. [ Palindromes
	 * are words that have similar characters from left and right both. Ex: noon,
	 * radar, civic, etc.
	 */
	public static boolean isPalendrome(String word) {
		char[] arr = word.toCharArray();
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {
				result = true;
				continue;
			} else
				result = false;
			break;

		}
		return result;
	}

}
