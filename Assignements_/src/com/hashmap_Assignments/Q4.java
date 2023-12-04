package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Float, Double> hmap = new HashMap<>();
		hmap.put(10.5f, 20.0);
		hmap.put(15.5f, 30.0);
		hmap.put(18.5f, 40.0);
		hmap.put(12.5f, 50.0);
		hmap.put(13.5f, 60.0);
		System.out.println(hmap);
		Set<Entry<Float, Double>> s = hmap.entrySet();
		for(Entry<Float,Double>ob:s)
		{
			System.out.println(ob.getValue());
		}
		Iterator<Entry<Float,Double>>itr=s.iterator();
		while(itr.hasNext())
		{
			Entry<Float,Double>e=itr.next();
			System.out.println(e.getValue());
		}

	}

}
