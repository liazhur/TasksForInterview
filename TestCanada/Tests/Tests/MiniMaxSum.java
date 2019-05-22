package Tests;

public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		miniMaxSum(arr);
	}

	static void miniMaxSum(int[] arr) {
		Integer max = arr[0];
		Integer min = arr[0];
		Integer sum = 0;
		for (Integer i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		Integer maxSum = arr[0] + sum - min;
		Integer minSum = arr[0] + sum - max;

		System.out.print(minSum + " " + maxSum);
	}

}
