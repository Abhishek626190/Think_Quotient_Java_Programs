package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Duplicates Element not allowed....
		HashSet<String>hs=new HashSet<>();
		hs.add("Virat");
		hs.add("Rohit");
		hs.add("Shubhman");
		hs.add("Shreyash");
		hs.add("Rahul");
		hs.add("Surya");
		hs.add("Virat");
		// Iterate Set
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		//Contains method.....
		System.out.println("********");
		//boolean b=hs.contains("Virat");
		//System.out.println(b);
		//IsEmpty method........
		//System.out.println(hs.isEmpty());
		//remove method....
		//System.out.println(hs.remove("Virat"));
		//System.out.println(hs);
		//removeAll method......
		//hs.removeAll(hs);
		//System.out.println(hs);
		//System.out.println(hs.isEmpty());
		//clear method....
		hs.clear();
		System.out.println(hs);
		


	}

}
