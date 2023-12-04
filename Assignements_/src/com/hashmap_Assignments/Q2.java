package com.hashmap_Assignments;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Abhi");
		hmap.put(2, "Priya");
		hmap.put(3, "Sneha");
		hmap.put(4, "Sanu");
		hmap.put(5, "Priyanka");
		// System.out.println(hmap);
		// System.out.println(hmap.keySet());
		// System.out.println(hmap.values());
		Set<Entry<Integer, String>> s = hmap.entrySet();
		for (Entry<Integer, String> ob : s) {
			System.out.println(ob.getKey() + "=" + ob.getValue());
		}
		Iterator<Entry<Integer, String>> itr = s.iterator();
		System.out.println("**************");
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getValue() + "=" + e.getKey());
		}
	}

}
