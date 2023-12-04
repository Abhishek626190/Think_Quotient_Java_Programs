package com.linkedlst_Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		//System.out.println(l);
 		System.out.println("Reverse Iterate through listiterator");
		ListIterator<Integer>itr1=l.listIterator(l.size());
 		while(itr1.hasPrevious())
		{
			System.out.print(itr1.previous()+",");
		}
 		//Iterator<Integer>itr=l.iterator();
 		System.out.println("\nLinked List in reverse order by descendingIterator");
 		Iterator<Integer>itr2=l.descendingIterator();
 		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+",");
		}

	}

}
