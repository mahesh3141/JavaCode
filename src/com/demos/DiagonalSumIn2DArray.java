package com.demos;

import java.util.Iterator;

public class DiagonalSumIn2DArray {

	public static void main(String[] args) {
		int [][]a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 10 } };
		
		PrintDiagonalSum(a); 
	}
	
	static void PrintDiagonalSum(int a[][]) {
		int left=0,right=0;
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a.length;col++) {
				// left diagonal
				if(row==col) {
					left += a[row][col];
				}
				// right diagonal
				if((row+col)==(a.length-1)) {
					right+=a[row][col];
				}
			}
		}
		
		System.out.println("Left Diagonal sum "+left);
		System.out.println("Right Diagonal sum "+right);
	}

}
