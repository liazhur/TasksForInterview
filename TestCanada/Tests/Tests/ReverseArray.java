package Tests;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = { 10, 3, 5, 6, 2 };
		reverseArray(a);

	}

	static int[] reverseArrayRecursion(int[] a, int n) {
		int i = 0;
		reverseArrayRecursion(a, n--);
		return a;

	}

	static int[] reverseArray(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return a;
	}
}
