package com.demos;

public class NthElementInFibbonaci {

	
	public static void main(String[] args) {
		printFibo(8); 
		System.out.println(" Nth element from fibbonaci:= "+getNthElementFromFib(7)); 
	}
	
	private static int getNthElementFromFib(int a) {
		if(a<=1) return a;
		return getNthElementFromFib(a-1)+getNthElementFromFib(a-2);
	}
	
	private static void printFibo(int count) {
		int n1=0,n2=1,n3,i;
		
		System.out.println(n1+" "+n2);
		
		for(i=1;i<count;++i) { 
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}
	
}
