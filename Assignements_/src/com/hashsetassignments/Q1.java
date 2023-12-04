package com.hashsetassignments;

import java.util.HashSet;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<>();
		hs.add("Brown");
		hs.add("Violet");
		hs.add("Pink");
		hs.add("Marenda");
		hs.add("Silver");
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		

	}

}
