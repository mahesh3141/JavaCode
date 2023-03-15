package com.demos;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial is: "+getFactorial(7)); 
	}
	
	private static int getFactorial(int a) {
		if (a<=1) return 1;
		return a*getFactorial(a-1);
	}

}
