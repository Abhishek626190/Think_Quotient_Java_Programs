package com.treemap;

import java.util.TreeMap;

public class BookTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Book obj1=new Book(101,"Hindi",455f);
		Book obj2=new Book(105,"English",495f);
		Book obj3=new Book(106,"Sanskrit",755f);
		Book obj4=new Book(108,"Science",655f);
		Book obj5=new Book(103,"History",855f);
		BookComparator obj =new BookComparator();
		TreeMap<Book,Integer>tmap=new TreeMap<>(obj);
		tmap.put(obj5, 154);
		tmap.put(obj2, 454);
		tmap.put(obj4, 654);
		tmap.put(obj1, 254);
		tmap.put(obj3, 954);
 		System.out.println(tmap);

		
		

	}

}
