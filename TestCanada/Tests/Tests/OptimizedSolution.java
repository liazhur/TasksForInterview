package Tests;

import java.util.HashMap;
import java.util.Map;

public class OptimizedSolution {

	public static void main(String[] args) {
		int A[] = { 4, 6, 2, 2, 6, 6, 1 };
		System.out.println(solution(A));
		System.out.println(solutionOptimized(A));
	}

	static int solution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (A[i] == A[j])
					result = Math.max(result, Math.abs(i - j));
		return result;
	}

	static int solutionOptimized(int[] A) {

		Map<Integer, Integer[]> valueToMaxMinIndexMap = new HashMap<>();
		// save max and min index for each value occurring in the array
		// it's a O(N) time complexity solution
		for (int i = 0; i < A.length; i++) {
			Integer[] pair = valueToMaxMinIndexMap.get(A[i]);
			if (pair == null) {
				pair = new Integer[] { i, i };
				valueToMaxMinIndexMap.put(A[i], pair);
			} else {
				pair[1] = i;
			}
		}

		int maxIndexDiff = 0;
		for (Map.Entry<Integer, Integer[]> entry : valueToMaxMinIndexMap.entrySet()) {
			Integer[] indices = entry.getValue();
			maxIndexDiff = Math.max(maxIndexDiff, indices[1] - indices[0]);
		}

		return maxIndexDiff;

	}

}
