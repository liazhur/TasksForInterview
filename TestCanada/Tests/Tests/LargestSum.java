package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LargestSum {

//	Max sum in an array  
//	complexity O(n2)  because ode tries all n(n+1)/2 combinations of array 
//	elements to find the combination with the largest sum
	@Test
	public void findLargestSum() {
		int[] arr = { 12, 34, 10, 6, 40 };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = arr.length - 1; j > 0; j--) {
				temp = arr[i] + arr[j];
				if (temp < arr[i] + arr[j - 1]) {
					temp = arr[i] + arr[j - 1];
				} else
					result = temp;
			}
		}
		System.out.println(result);
		Assert.assertEquals(result, 74);
	}

	@Test
	public void findLargestSumOneTrace() {
		int[] arr = { 12, 34, 40, 6, 10 };
		int first = arr[0];
		int second = arr[1];
		int result = 0;

		if (arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}
		result = first + second;
		System.out.println(result);
		Assert.assertEquals(result, 74);

	}

}
