package Tests;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(leftRotation(5, 4)));

	}

	static int[] leftRotation(int num, int rotationNum) {

		int[] arr = new int[num];
		for (int i = 1; i <= num; i++) {
			arr[i - 1] = i;
		}

		int[] newArr = new int[num];

		int i = 0;
		while (i < rotationNum) {
			newArr[newArr.length - rotationNum + i] = arr[i];
			i++;
		}

		int j = 0;
		while (j < num - rotationNum) {
			newArr[j] = arr[rotationNum + j];
			j++;
		}

		return newArr;

	}

}
