package com.demos;

import java.util.Iterator;
import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scanner.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is a prime number ");
		}else {
			System.out.println(n+" is a prime number ");
		}
	
	}

	private static boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
