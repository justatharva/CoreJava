package com.collection;

import java.util.Comparator;

public class Employee {
	private int id;
	private String name;
	private String city;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
}

class Agesorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAge() == o2.getAge()) {
			return 0;
		}
		else if(o1.getAge() > o2.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

class Namesorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getName().compareTo(o2.getName()));
	}
	
}
