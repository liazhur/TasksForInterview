package Tests;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);
	}

	static void plusMinus(int[] arr) {
		List<Integer> posA = new ArrayList<Integer>();
		List<Integer> negA = new ArrayList<Integer>();
		List<Integer> zeroA = new ArrayList<Integer>();

		String[] result = new String[3];

		float pos = 0;
		float neg = 0;
		float zeros = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				posA.add(arr[i]);
			if (arr[i] < 0)
				negA.add(arr[i]);
			if (arr[i] == 0)
				zeroA.add(arr[i]);
		}

		pos = (float) (posA.size()) / (float) arr.length;
		neg = (float) (negA.size()) / (float) arr.length;
		zeros = (float) (zeroA.size()) / (float) arr.length;

		DecimalFormat df = new DecimalFormat("0.000000");

		result[0] = df.format(pos);
		result[1] = df.format(neg);
		result[2] = df.format(zeros);

		for (String n : result) {
			System.out.println(n);
		}

	}

}
