package com.demos;

import java.util.List;
import java.util.stream.Collectors;

public class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	static int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3, 1 };

	static void getDuplicate(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicates are " + a[i]);
				}
			}
		}

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] arg) {
		Product obj1 = new Product(1, "abc", 1000);
		Product obj2 = new Product(1, "abc1", 4000);
		Product obj3 = new Product(1, "abc2", 3000);
		Product obj4 = new Product(1, "abc3", 2000);

		List<Product> list = List.of(obj1, obj2, obj3, obj4);

		List<Product> resultList = list.stream().filter(e -> e.price == 3000).collect(Collectors.toList());

		System.out.println(" result " + resultList.toString());

		display(null);
		getDuplicate(arr);
	}

	static void display(String message) {
		System.out.println("its string param " + message);
	}

	static void display(Object obj) {
		System.out.println("its object param " + obj);
	}
}
