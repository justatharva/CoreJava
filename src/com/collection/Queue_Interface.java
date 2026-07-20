package com.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue_Interface {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(12);
		p.add(15);
//		p.add(null);
		p.add(20);
		p.add(25);
		
		System.out.println(p);
		System.out.println("==================================");
		System.out.println(p.contains(10));
		System.out.println("==================================");
		System.out.println(p.isEmpty());
		System.out.println("==================================");
		System.out.println(p.offer(23));
		System.out.println(p); 
		System.out.println("==================================");
		System.out.println(p.size());
		System.out.println("==================================");
		System.out.println(p.peek());
		System.out.println("==================================");
		System.out.println(p.poll());;
		System.out.println(p);
		System.out.println("==================================");
		
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		a.add(10);
		a.add(12);
		a.add(74);
		a.add(87);
		a.add(78);
		a.add(10);
		
		System.out.println(a);
		System.out.println("==================================");
		System.out.println(a.contains(12));
		System.out.println("==================================");
		System.out.println(a.hashCode());
		System.out.println("==================================");
		System.out.println(a.offer(55));
		System.out.println("==================================");
		System.out.println(a.size());
		System.out.println("==================================");
		System.out.println(a.peekFirst());
		System.out.println("==================================");
		System.out.println(a.getClass());
		System.out.println("==================================");
		System.out.println(a.clone());
		System.out.println("==================================");
		System.out.println(a.isEmpty());
		System.out.println("==================================");
		System.out.println(a.reversed());
		System.out.println("==================================");
//		System.out.println(a.toArray());
//		System.out.println("==================================");
//		System.out.println(a.descendingIterator());
//		System.out.println("==================================");
//		System.out.println(a.iterator());
//		System.out.println("==================================");
//		System.out.println(a.parallelStream());
//		System.out.println("==================================");
//		System.out.println(a.spliterator());
//		System.out.println("==================================");
//		System.out.println(a.stream());
//		System.out.println("==================================");
//		System.out.println(a);
	}
}
