package com.treemap;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

 
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		Integer i=o1.id;
		Integer j=o2.id;
		return i.compareTo(j);
	}
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		Float d1=o1.price;
//		Float d2=o2.price;
//		return d1.compareTo(d2);
//	}

}
