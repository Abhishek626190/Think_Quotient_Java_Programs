package com.hashsetassignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>hs=new HashSet<>();
		hs.add(10);
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(18);
		System.out.println("HashSet is"+hs);
		//Converting hashSet to array
		int arr[]=new int[hs.size()];
		int j=0;
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			arr[j]=i;
			j++;
		}
		System.out.println("Array Is"+Arrays.toString(arr));
		

	}

}
