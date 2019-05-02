package Tests;

public class RecursiveFindMax {

	static int[] a = new int[] { 10, 2, 30, 4, 5 };

	public static int findMax(int[] a, int index) {
		if (index > 0) {
			return findMaxFromTwo(a[index], findMax(a, index - 1));
		} else {
			return a[0];
		}
	}

	// custom Math.max(int a, int b) implementation
	public static int findMaxFromTwo(int a, int b) {
		int max;
		if (a > b)
			max = a;
		else
			max = b;
		return max;

	}

	public static void main(String[] args) {

		System.out.println(findMax(a, a.length - 1));
	}

}
