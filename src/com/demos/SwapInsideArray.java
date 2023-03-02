package com.demos;

import java.util.Arrays;
import java.util.Collections;

public class SwapInsideArray {

	static int[] SortArray(int a[], int n) {
		int left = 0, right = n - 1;

		// count even no;
		int countEven = 0;

		while (left < right) {
			// find first even no from left side
			while (a[left] % 2 == 0) {
				left++;
				countEven++;
			}

			// find first odd no from right side
			while (a[right] % 2 != 0 && left < right) {
				right--;
			}

			// swap even no present on left and odd no right
			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}

		}

		// Sort even number in ascending order
		Arrays.sort(a, countEven, n);

		return a;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 4 };
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------");
		System.out.println(Arrays.toString(SortArray(a, a.length)));

	}

}
