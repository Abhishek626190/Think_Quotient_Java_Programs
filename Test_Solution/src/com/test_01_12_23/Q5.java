package com.test_01_12_23;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l=new LinkedList<>();
		l.add("Neha");
		l.add("Sneha");
		l.add("Sunny");
		l.add("Pratiksha");
		l.add("Rupali");
		ListIterator<String> itr=l.listIterator(l.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}



	}

}
