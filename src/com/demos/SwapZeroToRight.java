package com.demos;

import java.util.Arrays;

public class SwapZeroToRight {
	
	static int[] a= {3,2,4,0,6,8,6,0,4,5,0,9};

	public static void main(String[] args) {
	
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				int temp=-1;
				// Below code shift the zero at left
				if(a[i]==0 && a[i]>a[j] ) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				//  Below code shift the zero at right
				if(a[i]==0 && a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		//	System.out.println("Sorted array zero to right "+a[i]); 
		}
		System.out.println("Zero at right "+Arrays.toString(a)); 

	}

}
