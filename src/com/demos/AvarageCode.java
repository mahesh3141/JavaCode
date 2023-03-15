package com.demos;

import java.util.List;



public class AvarageCode {

 static	List<Integer> arrays = List.of(78,123,79,111,90,145,89);
	
	public static void main(String[] args) {
	
	double data = arrays.stream().filter(e->e>100).mapToDouble(a->a).average().orElse(0.0);
				System.out.println("==> "+data); 		

	}

}
