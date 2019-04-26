package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PositionInCircularArr {

	static int[] arr = { 24, 45, 67, 81, 2, 18 };

	public static void main(String[] args) {
		System.out.println(search(arr, 0, arr.length - 1, 45));
	}

	@Test
	public void searchPosition() {
		Assert.assertEquals((search(arr, 0, arr.length - 1, 45)), 1);
		Assert.assertEquals((search(arr, 0, arr.length - 1, 18)), 5);
		Assert.assertEquals((search(arr, 0, arr.length - 1, 24)), 0);
	}

	/*
	 * Find the position of any number in sorted circular list of "n" numbers
	 * without using loops or built-in functions
	 * 
	 */
	static int search(int arr[], int l, int h, int key) {
		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		/* If arr[l...mid] first subarray is sorted */
		if (arr[l] <= arr[mid]) {
			/*
			 * As this subarray is sorted, we can quickly check if key lies in half or other
			 * half
			 */
			if (key >= arr[l] && key <= arr[mid])
				return search(arr, l, mid - 1, key);
			/*
			 * If key not lies in first half subarray, Divide other half into two subarrays,
			 * such that we can quickly check if key lies in other half
			 */
			return search(arr, mid + 1, h, key);
		}

		/*
		 * If arr[l..mid] first subarray is not sorted, then arr[mid... h] must be
		 * sorted subarry
		 */
		if (key >= arr[mid] && key <= arr[h])
			return search(arr, mid + 1, h, key);

		return search(arr, l, mid - 1, key);
	}

}
