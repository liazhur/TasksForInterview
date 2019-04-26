package Tests;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayProduct {
	static int arr[] = { 10, 3, 5, 6, 2 };

	public static void main(String[] args) {
//		Arrays.toString(productArray(arr));
		System.out.println(Arrays.toString(productArrayResult(arr)));
	}

	@Test
	public void arrayProduct() {
		Assert.assertEquals(Arrays.toString(productArray(arr)), "[180, 600, 360, 300, 900]");
	}

	// Given an array of integers, calculate for each position the product of all
	// members of the array except for the integer in current position

	static int[] productArray(int arr[]) {
		// Initialize memory to all arrays
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		/* Left most element of left array is always 1 */
		left[0] = 1;

		/* Rightmost most element of right array is always 1 */
		right[n - 1] = 1;

		/* Construct the left array */
		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		/*
		 * Construct the product array using left[] and right[]
		 */
		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		/* print the constructed prod array */
		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return prod;
	}

	// solution 2
	static int[] productArrayResult(int arr[]) {
		int[] prodArr = new int[arr.length];

		int prod = product(arr);

		// to exclude integer from current position - divide general product to current
		// element
		for (int i = 0; i < arr.length; i++) {
			prodArr[i] = prod / arr[i];
		}
		return prodArr;
	}

	// product of all elements in an array
	static int product(int arr[]) {
		int n = arr.length;
		int product = 1;

		for (int i = 0; i < n; i++) {
			product *= arr[i];
		}

		return product;
	}

}
