package com.hashmap_Assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class FindFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abhishek";
		char ch[] = str.toCharArray();
		// System.out.println(ch);
		HashMap<Character, Integer> strmap = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (strmap.containsKey(ch[i])) {
				int v = strmap.get(ch[i]);
				strmap.put(ch[i], v + 1);
			} else
				strmap.put(ch[i], 1);
		}
		Set<Entry<Character, Integer>> strset = strmap.entrySet();
		Iterator<Entry<Character, Integer>> itr = strset.iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
