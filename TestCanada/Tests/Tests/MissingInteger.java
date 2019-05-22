package Tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	static int a[] = { 1, -3, 2 };
	static int N = 100001;

	public static void main(String[] args) {

		System.out.println(solution(a));
//		System.out.println(verifyArrayContainsNumber(A, 2));
	}

	/*
	 * Find the smallest positive integer that does not occur in a given sequence.
	 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
	 * Given A = [1, 2, 3], the function should return 4. Given A = [−1, −3], the
	 * function should return 1. Write an efficient algorithm for the following
	 * assumptions: N is an integer within the range [1..100,000]; each element of
	 * array A is an integer within the range [−1,000,000..1,000,000].
	 */
	public static int solution(int[] A) {
		int[] posArr = removeNegativeNumbers(A);
		Integer[] arrInteger = Arrays.stream(posArr).boxed().toArray(Integer[]::new);
		Set<Integer> targetSet = new HashSet<Integer>(Arrays.asList(arrInteger));

		// write your code in Java SE 8
		for (int j = 1; j <= 100001; j++) {
			if (!targetSet.contains(j)) {
				return j;
			}
		}
		return 1;
	}

	public static int[] removeNegativeNumbers(int[] num) {
		int k = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				num[k++] = num[i];
			}
		}
		// Now input array is holding the output data
		// Return the length of output array
		return num;
	}
}
