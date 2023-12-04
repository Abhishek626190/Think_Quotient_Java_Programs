package com.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In HashMap insertion order is not preserved...
		HashMap<Integer,String>hmap=new HashMap<>();
		hmap.put(101, "Abhi");
		hmap.put(103, "Abhishek");
		hmap.put(102, "Abhijeet");
		System.out.println(hmap);
		
		//In LinkedHashMap insertion order is preserved...
 		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(101, "Abhi");
		lmap.put(103, "Abhishek");
		lmap.put(102, "Abhijeet");
		System.out.println(lmap);

		
	}

}
