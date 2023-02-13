package com.demos;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int b[]={44,66,99,77,33,22,55}; 
		System.out.println("Second Largest via Ascending Array: "+getSecondLargestViaAscendingArray(b,b.length));
		System.out.println("Second Largest via Descending Array: "+getSecondLargestViaDescendingArray(b,b.length)); 

	}
	
	private static int getSecondLargestViaAscendingArray(int[] a,int total) {
		int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					// sort the array in ascending now
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Ascending Array:- "+ Arrays.toString(a));
		return a[total-2];
	}

	
	private static int getSecondLargestViaDescendingArray(int[] a,int total) {
		int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]<a[j]) {
					// sort the array in descending now
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Descending Array:- "+ Arrays.toString(a));
		return a[1];
	}
}
