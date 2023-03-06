package com.demos;

import java.util.Arrays;

public class EvenOddSwap {

	static int [] evenOddArray = {2,5,4,6,1,7,9,8,3};
	
	/**
	 * 1]-> Task is shift the event number to left side in side array
	 * 2]-> Task is shift the odd number to right side in side array
	 * 
	 */
	
	public static void main(String[] args) {
		shiftEvenOdd(evenOddArray);

	}

	private static void shiftEvenOdd(int[] a) { 
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp = -1;
				System.out.println("a[i]:- "+a[i]+" a[j] "+a[j]); 
				// shift even to left
				if (a[i] % 2 == 0  && a[i]>a[j]  ) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				System.out.println("===> a[i]:- "+a[i]+" a[j] "+a[j]);
				//shift odd to right
				if ( a[i] % 2 != 0  && a[i]<a[j] ) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				System.out.println("***** a[i]:- "+a[i]+" a[j] "+a[j]);
			}
		}
		System.out.println("Array with even to left and odd to right "+Arrays.toString(a)); 
	}

}
