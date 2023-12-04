package com.treemap;

import java.util.TreeMap;

public class CeilingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(101,"Sneha");		
		tmap.put(203,"Sanu");
		tmap.put(304,"Priyanka");
 		tmap.put(406,"Aaruhi");
		tmap.put(508,"Isshu");
		
		System.out.println(tmap.ceilingKey(500));
		//System.out.println(tmap.ceilingEntry(500));

 		System.out.println(tmap);

		

	}

}
