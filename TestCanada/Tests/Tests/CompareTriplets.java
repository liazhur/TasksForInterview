package Tests;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);

		List<Integer> b = new ArrayList<Integer>();
		b.add(99);
		b.add(16);
		b.add(8);

		compareTriplets(a, b);

	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> result = new ArrayList<Integer>();
		int countA = 0;
		int countB = 0;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				countA++;
			}
			if (a.get(i) < b.get(i)) {
				countB++;
			}
		}
		result.add(countA);
		result.add(countB);
		for (Integer num : result) {
			System.out.print(num + " ");
		}
		return result;

	}

}
