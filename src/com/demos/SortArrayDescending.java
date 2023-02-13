package com.demos;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

	public static void main(String[] args) {
		Integer[] array = { 23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205 };
		// sorts array[] in descending order
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(array));

		//sorting array via logic
		System.out.println("Sorting array via descending logic...");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[i]< array[j]) {
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
