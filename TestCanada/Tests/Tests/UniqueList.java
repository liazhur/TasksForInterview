package Tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniqueList {

	public static void main(String[] args) {
		getUnique();
	}

	public static void getUnique() {
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

}
