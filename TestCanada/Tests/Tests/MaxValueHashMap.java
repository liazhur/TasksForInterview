package Tests;

import java.util.HashMap;
import java.util.Map;

public class MaxValueHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> newMap = new HashMap<String, Integer>();
		newMap.put("a", 1);
		newMap.put("b", 3);
		newMap.put("c", 8);
		newMap.put("d", 6);
		newMap.put("e", 5);
		newMap.put("f", 4);
		System.out.println(findMaxInHashMap(newMap));
	}

	public static int findMaxInHashMap(HashMap<String, Integer> newMap) {

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}

		return maxEntry.getValue();

	}

}
