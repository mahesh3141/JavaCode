package com.demos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMapWithStream {

	public static void main(String[] args) {

		List<Employee> mapEmployees = new ArrayList<Employee>();
		mapEmployees.add(new Employee("Mahesh", "MH", 25000.0, 3, 30));
		mapEmployees.add(new Employee("Manya", "MH", 21000.0, 2, 35));
		mapEmployees.add(new Employee("Ravi", "MP", 20000.0, 1, 40));
		mapEmployees.add(new Employee("Buntya", "UP", 27000.0, 4, 41));

		List<Employee> tempList = mapEmployees.stream()
				.filter(e -> e.state.equals("MH") && e.age >= 30)
				.collect(Collectors.toList());
		tempList.forEach(System.out::println);

	}

}

class Employee {
	String name;
	String state;
	double salary;
	int id;
	int age;

	public Employee() {
		super();
	}

	public Employee(String name, String state, double salary, int id, int age) {
		super();
		this.name = name;
		this.state = state;
		this.salary = salary;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", state=" + state + ", salary=" + salary + ", id=" + id + ", age=" + age
				+ "]";
	}
	

}
