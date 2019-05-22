package Tests;

public class AirPlane {

	public static void main(String[] args) {
		int A[] = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
		System.out.print(solution2(A));
	}

	/*
	 * A subarray A[i], A[i+1], ..., A[j] of A is said to be turbulent if and only
	 * if: For i <= k < j, A[k] > A[k+1] when k is odd, and A[k] < A[k+1] when k is
	 * even; OR, for i <= k < j, A[k] > A[k+1] when k is even, and A[k] < A[k+1]
	 * when k is odd. That is, the subarray is turbulent if the comparison sign
	 * flips between each adjacent pair of elements in the subarray. Return the
	 * length of a maximum size turbulent subarray of A. Example 1: Input:
	 * [9,4,2,10,7,8,8,1,9] Output: 5 Explanation: (A[1] > A[2] < A[3] > A[4] <
	 * A[5]) Example 2: Input: [4,8,12,16] Output: 2 Example 3: Input: [100] Output:
	 * 1 Note: 1. 1 <= A.length <= 40000 2. 0 <= A[i] <= 10^9
	 */

	/**
	 * Approach: Traverse Array Time Complexity: O(n) Space Complexity: O(1)
	 */

	public static int solution(int[] A) {
		int increaseLength = 1;
		int decreaseLength = 1;
		int result = 1;

		for (int i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1]) {
				decreaseLength = increaseLength + 1;
				increaseLength = 1;
			} else if (A[i] > A[i - 1]) {
				increaseLength = decreaseLength + 1;
				decreaseLength = 1;
			} else {
				increaseLength = 1;
				decreaseLength = 1;
			}
			result = Math.max(result, Math.max(increaseLength, decreaseLength));
		}

		return result;
	}

	public static int solution2(int[] A) {
		int[] arrayHelper = new int[A.length];
		for (int i = 0; i < arrayHelper.length; i++) {
			if (i == 0) {
				arrayHelper[i] = 0;
			} else {
				int diff = A[i] - A[i - 1];
				if (diff == 0) {
					arrayHelper[i] = arrayHelper[i - 1];
				} else {
					arrayHelper[i] = (diff > 0) ? 1 : -1;
				}
			}
		}

		int longestPeriod = 1, currentPeriod = 1;
		for (int i = 1; i < arrayHelper.length; i++) {
			if (arrayHelper[i] != arrayHelper[i - 1]) {
				currentPeriod++;
				if (i > 1 && arrayHelper[i - 1] == arrayHelper[i - 2]) {
					currentPeriod++;
				}
			} else {
				// reset the current period to 1
				currentPeriod = 1;
			}
			longestPeriod = Math.max(currentPeriod, longestPeriod);
		}
		return longestPeriod;
	}
}