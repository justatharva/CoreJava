package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_Interface {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Rahul", "Pune", 26);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(new Employee(102, "Ramesh", "Nagpur", 30));
		list.add(new Employee(103, "Rohit", "Mumbai", 29));
		list.add(new Employee(104, "Rupesh", "Baramati", 27));
		list.add(new Employee(105, "Ritesh", "Nashik", 30));
		list.add(new Employee(106, "Renu", "Dhule", 20));
		
//		System.out.println(list);
		for(Employee elist : list) {
			System.out.println(elist);
		}
		System.out.println();
		System.out.println("After Age Sorting");
		Collections.sort(list, new Agesorting());
		for(Employee elist : list) {
			System.out.println(elist);
		}
		System.out.println();
		System.out.println("After Name Sorting");
		Collections.sort(list, new Namesorting());
		for(Employee elist : list) {
			System.out.println(elist);
		}
	}
}
