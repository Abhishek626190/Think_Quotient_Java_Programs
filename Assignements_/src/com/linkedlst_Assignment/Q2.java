package com.linkedlst_Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		//System.out.println(l);
		System.out.println("Iterate through iterator");
 		Iterator<Integer>itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
 		System.out.println("\nIterate through listiterator");
		ListIterator<Integer>itr1=l.listIterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+",");
		}
	}

}
