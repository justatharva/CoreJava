package com.collection;

import java.util.Vector;

public class Vector_Methods {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(23);
		v.add(32);
		v.add(54);
		v.add(null);
		v.add(54);
		
		System.out.println(v);
		System.out.println("==================================");
		System.out.println(v.capacity());
		System.out.println("==================================");
		System.out.println(v.contains(54));
		System.out.println("==================================");
		System.out.println(v.elementAt(5));
		System.out.println("==================================");
		System.out.println(v.firstElement());
		System.out.println("==================================");
		System.out.println(v.get(4));
		System.out.println("==================================");
		System.out.println(v.getFirst());
		System.out.println("==================================");
		System.out.println(v.getLast());
		System.out.println("==================================");
		System.out.println(v.indexOf(3));
		System.out.println("==================================");
		System.out.println(v.hashCode());
		System.out.println("==================================");
		System.out.println(v.isEmpty());
		System.out.println("==================================");
		System.out.println(v.lastElement());
		System.out.println("==================================");
		System.out.println(v.size());
		System.out.println("==================================");
		v.addElement(55);
		System.out.println(v);
		System.out.println("==================================");
		System.out.println(v.set(4, 84));
		System.out.println(v);
		System.out.println("==================================");
		v.sort(null);
		System.out.println(v);
		System.out.println("==================================");
	}
}
