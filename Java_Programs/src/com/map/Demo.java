package com.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Abhi");
		hmap.put(2, "Adarsh");
		hmap.put(3, "Sunish");
		hmap.put(4, "Maruti");
		// System.out.println(hmap);

		HashMap<Integer, String> hmap1 = new HashMap<>(hmap);
		// System.out.println(hmap1);
		Set<Map.Entry<Integer, String>> set = hmap.entrySet();
		for (Map.Entry<Integer, String> ob : set) {
			System.out.println(ob.getKey() + "..." + ob.getValue());
		}
		System.out.println("****************");
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + ".." + e.getValue());
		}
	}

}
