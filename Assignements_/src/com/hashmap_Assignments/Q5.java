package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("Madhuri", 101);
		hmap.put("JayShree", 102);
		hmap.put("Medha", 103);
		hmap.put("Komal", 104);
		hmap.put("Nisha", 105);
		System.out.println(hmap);
		HashMap<String, Integer> hmap1 = new HashMap<>(hmap);
		System.out.println(hmap1);
		Set<Entry<String, Integer>> s = hmap1.entrySet();
		for (Entry<String, Integer> ob : s) {
			System.out.println(ob.getValue() + "=" + ob.getKey());
		}
		Iterator<Entry<String, Integer>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
