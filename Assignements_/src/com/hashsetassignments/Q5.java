package com.hashsetassignments;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		hs.add("Brown");
		hs.add("Violet");
		hs.add("Pink");
		hs.add("Marenda");
		hs.add("Silver");
		Iterator<String>itr=hs.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		//********************
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(12);
		lhs.add(14);
		lhs.add(16);
		lhs.add(18);
		System.out.println(lhs);
		Object arr1[]=lhs.toArray();
		//System.out.println(Arrays.toString(arr1));
		Integer arr[]=new Integer[lhs.size()];
		lhs.toArray(arr);
		//System.out.println(Arrays.toString(arr));
		//************
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<>();
		//System.out.println(lhs1.isEmpty());

		

		
	}

}
