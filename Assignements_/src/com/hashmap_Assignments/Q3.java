package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("Adarsh", 1);
		hmap.put("Pritam", 2);
		hmap.put("Sunish", 3);
		hmap.put("Yogesh", 4);
		hmap.put("Ganesh", 5);
		// System.out.println(hmap.keySet());
		// System.out.println(hmap.values());

		Set<Entry<String, Integer>> s = hmap.entrySet();
		for (Entry<String, Integer> ob : s) {
			System.out.println(ob.getKey());
		}
		Iterator<Entry<String, Integer>> itr = s.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			System.out.println(e.getKey());
		}

	}

}
