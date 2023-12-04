package com.treemap;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(101, "Mumbai");
		tmap.put(102, "Delhi");
		tmap.put(103, "Amarkantak");
		tmap.put(104, "Chennai");
		tmap.put(105, "Lucknow");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter City Name");
		String str=sc.next();
		
		for(Entry<Integer, String> s:tmap.entrySet())
		{
			if(s.getValue().equals(str))
			{
				System.out.println(s.getKey()+" :"+s.getValue());
			}
		}

		

	}

}
