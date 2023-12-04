package com.linkedhashmap;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class BookLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book(101, "C", 650);
		Book obj2 = new Book(102, "C++", 750);
		Book obj3 = new Book(103, "Python", 950);
		Book obj4 = new Book(104, "Java", 1050);
		Book obj5 = new Book(105, "ReactJs", 850);

		LinkedHashMap<Book, Integer> bmap = new LinkedHashMap<>();
		bmap.put(obj1, 5);
		bmap.put(obj2, 8);
		bmap.put(obj3, 11);
		bmap.put(obj4, 21);
		bmap.put(obj5, 19);
		Set<Entry<Book, Integer>> set = bmap.entrySet();
		Iterator<Entry<Book, Integer>> itr = set.iterator();
		//Maximum Copies.....
		Book b = null;
		int max = 0;
		while (itr.hasNext()) {
			Entry<Book, Integer> e = itr.next();
			// System.out.println(e.getKey() + "Number of copies Available" + e.getValue());
			int i = e.getValue();
			if (max < i) {
				max = i;
				b = e.getKey();
			}
		}
		System.out.println("Highest Number Of copy is: " + max + "\nThe details of Book is: " + b);
		System.out.println("***************");
		//Minimum Copies.....
		ArrayList<Integer> al = new ArrayList<>(bmap.values());
		// System.out.println(al);
		Collections.sort(al);
		int min = al.get(0);
		// System.out.println(al);
		Book bo = null;
		Set<Book> setbook = bmap.keySet();
		Iterator<Book> itrbook = setbook.iterator();
		while (itrbook.hasNext()) {
			Book b1 = itrbook.next();
			if (bmap.get(b1) == min) {
				bo = b1;
			}
		}
		System.out.println("Minimum Number Of copy is: " + min + "\nThe details of Book is: " + bo);
		System.out.println("**************************");
	}

}
