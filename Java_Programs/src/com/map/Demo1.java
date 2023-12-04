package com.map;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "JAVA");
		hm.put(102, "PYTHON");
		hm.put(103, "C#");
		hm.put(104, "C");
		hm.put(105, "C++");
		Set<Entry<Integer, String>> set = hm.entrySet();
		for (Entry<Integer, String> obj : set) {
			System.out.println(obj.getKey() + "***" + obj.getValue());
		}
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e);

		}

	}

}
