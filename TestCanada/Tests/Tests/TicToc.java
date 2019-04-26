package Tests;

import java.util.Arrays;

public class TicToc {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getTicToc(16)));
	}

	/*
	 * Write a program that returns an array with element values of: tic if index
	 * multiple of 3, toc if index multiple of 5, tictoc if index multiple of 3 and
	 * 5, and index value if otherwise.
	 */

	public static String[] getTicToc(int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				result[i] = "tictoc ";
				continue;
			}
			if (i % 3 == 0) {
				result[i] = "tic ";
				continue;
			}
			if (i % 5 == 0) {
				result[i] = "toc ";
				continue;

			} else {
				result[i] = "" + i;
				continue;
			}
		}
		for (String i : result) {
			System.out.println(i);
		}
		return result;
	}

}
