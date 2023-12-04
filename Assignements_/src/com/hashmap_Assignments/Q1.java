package com.hashmap_Assignments;

import java.util.HashMap;

//WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hmap=new HashMap();
		hmap.put(1, "Abhi");
		hmap.put(2, "Priya");
		hmap.put(3, "Sneha");
		hmap.put(4, "Sanu");
		hmap.put(5,"Priyanka");
		System.out.println(hmap);
		
		HashMap hmap1=new HashMap();
		hmap1.put( "Abhi",1);
		hmap1.put("Priya",2);
		hmap1.put("Sneha",3);
		hmap1.put("Sanu",4);
		hmap1.put("Priyanka",5);
		System.out.println(hmap1);
		
	}

}
