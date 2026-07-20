package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Interface {
	public static void main(String[] args) {
		Student s = new Student(1, "John", "Pune", 30);
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(new Student(2, "Rahul", "Satara", 22));
		list.add(new Student(3, "Rohit", "Mumbai", 25));
		list.add(new Student(4, "Ritesh", "Nagpur", 15));
		list.add(new Student(5, "Ramesh", "Dhule", 32));
		list.add(new Student(6, "Renu", "Baramati", 30));
		
//		System.out.println(list);
		System.out.println("Before Sorting");
		for(Student slist : list) {
			 System.out.println(slist);
		}
		System.out.println();
		System.out.println("After Sorting");
		Collections.sort(list);
		
		for(Student slist : list) {
			 System.out.println(slist);
		}
	}
}
