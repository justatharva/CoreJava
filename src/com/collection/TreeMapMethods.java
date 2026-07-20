package com.collection;

import java.util.TreeMap;

public class TreeMapMethods {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(1, "pen");
		t.put(2, "Pencil");
		t.put(3, "book");
		t.put(4, "notebook");
		t.put(5, "bottle");
		t.put(6, "hello");
		t.put(7, "java");
		t.put(8, null);
		
		System.out.println(t);
		System.out.println("==================================");
		System.out.println(t.compute(3, (k,v)->v.concat("JS")));
		System.out.println("==================================");
		System.out.println(t.computeIfAbsent(9, (k->"BS")));
		System.out.println("==================================");
		System.out.println(t.computeIfPresent(7, (k,v)->v.toUpperCase()));
		System.out.println("==================================");
		System.out.println(t.hashCode());
		System.out.println("==================================");
		System.out.println(t.get(8));
		System.out.println("==================================");
		System.out.println(t.ceilingKey(8));
		System.out.println("==================================");
		System.out.println(t.floorKey(7));
		System.out.println("==================================");
		System.out.println(t.higherKey(7));
		System.out.println("==================================");
		System.out.println(t.lowerKey(7));
		System.out.println("==================================");
		System.out.println(t.toString());
		System.out.println("==================================");
		System.out.println(t.ceilingEntry(3));
		System.out.println("==================================");
		System.out.println(t.descendingKeySet());
		System.out.println("==================================");
		System.out.println(t.firstEntry());
		System.out.println("==================================");
		System.out.println(t.floorEntry(5));
		System.out.println("==================================");
		System.out.println(t.headMap(7));
		System.out.println("==================================");
		System.out.println(t.subMap(2, 6));
		System.out.println("==================================");
		System.out.println(t.sequencedEntrySet());
		System.out.println("==================================");
		System.out.println(t.sequencedKeySet());
		System.out.println("==================================");
		System.out.println(t.sequencedValues());
		System.out.println("==================================");
		System.out.println(t.tailMap(8));
		System.out.println("==================================");
		System.out.println(t.values());
		System.out.println("==================================");
	}
}
