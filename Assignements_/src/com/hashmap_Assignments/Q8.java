package com.hashmap_Assignments;
//8.WAP to remove an element from HashMap using key
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("Madhuri", 101);
		hmap.put("JayShree", 102);
		hmap.put("Medha", 103);
		hmap.put("Komal", 104);
		hmap.put("Nisha", 105);
		System.out.println(hmap);
 		//System.out.println(hmap);
		Set<Entry<String, Integer>> s = hmap.entrySet();
//		for (Entry<String, Integer> ob : s) {
//			System.out.println(ob.getValue() + "=" + ob.getKey());
//		}
		Iterator<Entry<String, Integer>> itr = s.iterator();
		System.out.println("Enter key to Remove  element");
		String str=sc.next();
		while (itr.hasNext()) {
			Entry<String, Integer> e = itr.next();
			if(e.getKey().equals(str)) {
				//System.out.println(e.getKey() + "=" + e.getValue());
				itr.remove();
			}
 		}
		System.out.println("Your Map Data After Remove : "+hmap);


	}

}
