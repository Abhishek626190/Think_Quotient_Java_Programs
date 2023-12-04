package com.linkedhashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Abhi");
		hmap.put(103, "Abhishek");
		hmap.put(102, "Abhijeet");
		// System.out.println(hmap);

		// In LinkedHashMap insertion order is preserved...
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>(hmap);
		lmap.put(105, "Priya");
		lmap.put(104, "Dhaani");
		lmap.put(106, "Rupali");
		// System.out.println(lmap);
		Set<Entry<Integer, String>> set = lmap.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		int max = 0;
		String str = null;

		while (itr.hasNext()) {
			System.out.println(itr.next());
			Entry<Integer, String> e = itr.next();
			Integer i = e.getKey();
			if (i > max) {
				max = i;
				str = e.getValue();
			}

		}
		System.out.println("Highest Key IS " + max + " And the value associated with that key is:" + str);
//		lmap.clear();
//		System.out.println(lmap);
//		System.out.println(lmap.isEmpty());
//		lmap.remove(105);
//		System.out.println(lmap);

	}

}
