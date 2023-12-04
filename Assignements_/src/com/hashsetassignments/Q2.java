package com.hashsetassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>hs=new ArrayList<>();
		hs.add("Brown");
		hs.add("Violet");
		hs.add("Pink");
		hs.add("Marenda");
		hs.add("Silver");
		Iterator<String>itr=hs.iterator();
		HashSet<String>hs1=new HashSet<>();
		while(itr.hasNext())
		{
			String s=itr.next();
			hs1.add(s);
		}
		System.out.println(hs1);
		 
	}

}
