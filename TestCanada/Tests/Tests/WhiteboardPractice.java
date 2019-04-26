package Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhiteboardPractice {

	@Test

	public void prime() {

		boolean result = false;
		int number = 7;

		if (number == 0 || number == 1 || number == 2) {
			result = true;
			System.out.println(result);

		} else
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					System.out.println(result);
					break;
				}
			}
		result = true;
		System.out.println(result);

	}

	@Test
	public void getUnique() {
		List<String> ul = new ArrayList<>();// create list with duplicates...
		ul.add("Test");
		ul.add("Test");
		ul.add("Not a copy");
		ul.add("Test");
		Set<String> uniqueList = new HashSet<String>(ul);
		System.out.println(uniqueList);
		System.out.println("Unique gas count: " + uniqueList.size());

		HashSet<String> h = new HashSet<String>();
		// Adding elements into HashSet usind add()
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		h.add("India");// adding duplicate elements

		// Displaying the HashSet
		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));

		// Removing items from HashSet using remove()
		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		// Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	@Test /* Print duplicates present in the passed string */

	public void printUniqueFromString() {

		String str = "Hello word!";
		final int NO_OF_CHARS = 256;

		int[] count = new int[NO_OF_CHARS];

		/* Count array with frequency of characters */
		int i;
		for (i = 0; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;
		int n = i;

		// Print characters having count more than 0
		for (i = 0; i < n; i++)
			if (count[(int) str.charAt(i)] == 1)
				System.out.print(str.charAt(i));
	}

	@Test /* Print duplicates present in the passed string */

	public void printUniqueFromString2() {

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

	@Test /* Print duplicates present in the passed string */

	public void printUniqueFromStringBestSolution() {
		String s = "Hello word!";
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

		Assert.assertEquals(result, "Hewrd!");
	}

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

//	Max sum in an array  
//	complexity O(n2)  because ode tries all n(n+1)/2 combinations of array 
//	elements to find the combination with the largest sum
	@Test /* Remove duplicates present in the passed string */

	public void findLargestSum() {
		int[] arr = { 12, 34, 10, 6, 40 };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = arr.length - 1; j > 0; j--) {
				temp = arr[i] + arr[j];
				if (temp < arr[i] + arr[j - 1]) {
					temp = arr[i] + arr[j - 1];
				} else
					result = temp;
			}
		}
		System.out.println(result);
		Assert.assertEquals(result, 74);
	}

	@Test /* Remove duplicates present in the passed string */
	public void findLargestSumOneTrace() {
		int[] arr = { 12, 34, 40, 6, 10 };
		int first = arr[0];
		int second = arr[1];
		int result = 0;

		if (arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}
		result = first + second;
		System.out.println(result);
		Assert.assertEquals(result, 74);

	}

	int[] arr = { 55, 68, 72, 99, 30, 124, 235 };

	@Test /* Remove duplicates present in the passed string */
	public void buySell(int[] arr) {

	}

	@Test /*  */

	public void reverseLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		System.out.println(linkedList);

		int current = 0;
		for (int i = 0; i < linkedList.size(); i++) {

			current = linkedList.get(i);
			linkedList.addFirst(linkedList.get(linkedList.size() - i - 1));
			linkedList.addLast(current);
			linkedList.remove(i + 1);
			linkedList.remove(linkedList.get(linkedList.size() - 2 - i));

		}
		System.out.println("Reversed:");
		System.out.println(linkedList);
	}

}
