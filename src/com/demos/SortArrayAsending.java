package com.demos;

import java.util.Arrays;

public class SortArrayAsending {

	public static void main(String[] args) {
		int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
		// invoking sort() method of the Arrays class
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		// prints array using the for loop
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// below code is for sorting array via logic
		// sorting logic
		System.out.println("Sorting array via ascending logic...");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i]> array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			//prints the sorted element of the array  
			System.out.println(array[i]);  
			
		}
		
	}

}
