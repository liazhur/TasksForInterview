package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunTestNG {

	@Test
	public void testPrimes() {
		Assert.assertEquals(MyPractice.findPrimes(23), " 2 3 5 7 11 13 17 19 23");
	}

	@Test
	/*
	 * find pairs of elements from an array which sum to a specified value. -> Given
	 * an array of integers, and a number ‘sum’, find the number of pairs of
	 * integers in the array whose sum is equal to ‘sum’.
	 */
	public void findNumberOfPairsSum() {
		int[] arr = { 1, 5, 7, -1, 5 };
		Assert.assertEquals(MyPractice.findNumberOfPairsSum(arr, 6), 3);
	}

	@Test
	/*
	 * Write a java program to alternatively contact 2 strings: Given 2 strings,
	 * merge them in an alternate way, i.e. the final string’s first character is
	 * the first character of the first string, the second character of the final
	 * string is the first character of the second string and so on. And if once you
	 * reach end of one string while if another string is still remaining then
	 * append the remaining of that string to final string
	 */
	public void concutStrings() {
		Assert.assertEquals(MyPractice.concutStrings("hello", "World"), "hWeolrllod");
	}

	@Test
	/*
	 * Write a Java program to print Fibonacci series upto 100? 0, 1, 1, 2, 3, 5, 8,
	 * 13, 21, 34, 55, 89
	 */
	public void fibbonachi() {
		Assert.assertEquals(MyPractice.fibonachi2(100), "0 1 1 2 3 5 8 13 21 34 55 89");
		Assert.assertEquals(MyPractice.fibonachi(100), "0 1 1 2 3 5 8 13 21 34 55 89");
	}

	@Test
//	Find the first repeating character in a string
//	Time Complexity of this solution is O(n2)
	public void findFirsRepeatingCharHashSet() {
		Assert.assertEquals(MyPractice.findFirsRepeatingCharHashSet("Hello, World! it's me"), 'l');
		Assert.assertEquals(MyPractice.findFirsRepeatingChar("Hello, World! it's me"), 'e');
	}

	@Test
	// Returns the number of occurences of a given character in a String
	public void numberOccurences() {
		Assert.assertEquals(MyPractice.numberOccurences("Hello, World! it's me o o o", 'o'), 5);
	}

	@Test
	// Reverse each word in the given string e.g "Hello, World!" -> "olleH, dlroW! "
	public void reverseStringWithSpecialChars() {
		Assert.assertEquals(MyPractice.reverseStringWithSpecialChars("Hello, World!"), "olleH, dlroW!");
		Assert.assertEquals(MyPractice.reverseWordSplitNotFullSolution("Hello, World! it's me"),
				"olleH, dlroW! sti' em ");
	}

	@Test
	/*
	 * Write a function that takes a number as input and returns true if this number
	 * is an Armstrong number or false if it is not
	 */
	public void isArmstrongNumber() {
		Assert.assertEquals(MyPractice.isArmstrongNumber(407), true);
		Assert.assertEquals(TestsInterview.isArmstrongNumber2(407), true);
		Assert.assertEquals(TestsInterview.isArmstrongNumber(407), true);
	}

	@Test
	// Write a function that takes an array of zeros and ones as input
	// and returns the maximum number of consecutive zeros or ones
	public void findMaxZerosOrOnes() {
		int[] enterArray = { 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		Assert.assertEquals(TestsInterview.findMaxZerosOrOnes(enterArray), "Max is 1: 7");
		Assert.assertEquals(TestsInterview.findMaxOnes(enterArray), 7);
		Assert.assertEquals(TestsInterview.findMaxZerosOrOnes(enterArray), "Max is 1: 7");
	}

	@Test
	/*
	 * There is a scoundrel who stole a dog from a neighbor. He wants to write a
	 * ransom note, cutting out words from a newspaper. The task is to write a
	 * function that accepts 2 strings (text of the newspaper, text of the note) and
	 * returns true if all the words from the note are in the text of the newspaper
	 * or false if there are not enough words cover case when words in note more
	 * than in newspaper
	 */
	public void checkNewspaperWordsLists() {
		Assert.assertEquals(TestsInterview.checkNewspaperWordsLists("abc, de! de fg", "de? fg fg de abc"), false);
		Assert.assertEquals(TestsInterview.checkNewspaperWordsLists("abc, de! de fg", "de? fg de abc"), true);

		Assert.assertEquals(TestsInterview.checkNewspaperWordsHashMap("abc, de! de fg", "de? fg# fg"), false);
		Assert.assertEquals(TestsInterview.checkNewspaperWordsHashMap("abc, de! de fg", "de? fg#"), true);

	}

}
