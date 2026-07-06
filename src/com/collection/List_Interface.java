package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(22);
		l.add(null);
		l.add("Hello");
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(null);
		l1.add(23);
		l1.add(30);
		l1.add(20);
		l1.add(25);
		System.out.println("===========================================================");
		System.out.println("ArrayList Elements : "+l1);
		System.out.println("===========================================================");
		System.out.println("Check contains() element in ArrayList : "+l1.contains(30));
		System.out.println("===========================================================");
		System.out.println("return hashCode() of ArrayList : "+l1.hashCode());
		System.out.println("===========================================================");
		System.out.println("return indexOf() ArrayList : "+l1.indexOf(23));
		System.out.println("===========================================================");
		System.out.println("Check isEmpty() : "+l1.isEmpty());
		System.out.println("===========================================================");
		System.out.println("return lastIndexOf() ArrayList : "+l1.lastIndexOf(23));
		System.out.println("===========================================================");
		System.out.println("remove() Perticular Element : "+l1.remove(null));
		System.out.println("===========================================================");
		System.out.println("removeFirst() Element : "+l1.removeFirst());
		System.out.println("===========================================================");
		System.out.println("removeLast() Element : "+l1.removeLast());
		System.out.println("===========================================================");
		System.out.println("Remaining Elements in ArrayList : "+l1);
		System.out.println("===========================================================");
		
		l1.addFirst(20);
		l1.addLast(100);
		System.out.println("After adding First and Last Element in ArrayList : "+l1);
		System.out.println("===========================================================");
		System.out.println("Size : "+l1.size());
		System.out.println("===========================================================");
		System.out.println("getFirst() Element : "+l1.getFirst());
		System.out.println("===========================================================");
		System.out.println("getLast() Element: "+l1.getLast());
		System.out.println("===========================================================");
		System.out.println("reversed() Elements : "+l1.reversed());
		System.out.println("===========================================================");
	}
}
