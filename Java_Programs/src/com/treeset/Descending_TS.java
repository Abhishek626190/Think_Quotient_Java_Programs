package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Descending_TS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<>();
		ts.add("Abhi");
		ts.add("Aadarsh");
		ts.add("Vivek");
		ts.add("Suraj");
		Iterator<String>itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		//System.out.println(ts);
	}

}
