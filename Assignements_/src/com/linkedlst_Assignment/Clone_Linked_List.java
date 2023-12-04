package com.linkedlst_Assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Clone_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();
		l.add(18);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(10);
		System.out.println("List l1\n"+l);
		LinkedList<Integer> l1 = new LinkedList<>();
		Iterator<Integer>itr=l.iterator();
		Iterator<Integer>itr1=l.iterator();
  		while(itr.hasNext())
		{
			itr.next();
		}


	}

}
