package Tests;

import java.util.Arrays;

public class ReverseRecursive {

	static int[] a = new int[] { 1, 2, 3, 4, 5 };

	public static void reverseRecursive(int start, int end) {

		if (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			reverseRecursive(start, end);
		}
	}

	public static void main(String[] args) {

		reverseRecursive(0, a.length - 1);
		System.out.println("Reversed Array(Recursion):" + Arrays.toString(a));
		// old way to print array
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
