package com.collection;

public class Student implements Comparable<Student>{
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
	public Student(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(age>o.getAge()) {
			return 1;
		}
		else if(age == o.getAge()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
