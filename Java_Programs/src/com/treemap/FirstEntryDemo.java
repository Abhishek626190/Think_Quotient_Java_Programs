package com.treemap;

import java.util.TreeMap;

public class FirstEntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(101,"Sneha");		
		tmap.put(203,"Sanu");
		tmap.put(304,"Priyanka");
 		tmap.put(406,"Aaruhi");
		tmap.put(508,"Isshu");
 		System.out.println(tmap);

		System.out.println(tmap.firstKey());
		System.out.println(tmap.firstEntry());
 

	}

}
