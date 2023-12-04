package com.test_01_12_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Movie_Q8_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alist = Arrays.asList("Amitabh", "Amrita");
		// System.out.println(alist.get(0));

		List<String> alist2 = Arrays.asList("Salman", "Anushka");

		List<String> alist3 = Arrays.asList("Amitabh", "Ranveer", "Alia");

		List<String> alist4 = Arrays.asList("Amir", "Anushka");

		List<String> alist5 = Arrays.asList("Akshay", "Kareena", "Kiara");

		MovieQ8 obj1 = new MovieQ8(101, "Mard", alist);
		MovieQ8 obj2 = new MovieQ8(102, "Sultan", alist2);
		MovieQ8 obj3 = new MovieQ8(103, "Brahmastra", alist3);
		MovieQ8 obj4 = new MovieQ8(104, "PK", alist4);
		MovieQ8 obj5 = new MovieQ8(105, "GoodNewz", alist5);

		ArrayList<MovieQ8> mlist = new ArrayList<>();
		mlist.add(obj1);
		mlist.add(obj2);
		mlist.add(obj3);
		mlist.add(obj4);
		mlist.add(obj5);
		int count = 0;
		String str = "Amitabh";
		Iterator<MovieQ8> mitr = mlist.iterator();
		while (mitr.hasNext()) {
			MovieQ8 m = mitr.next();
			List<String> l = m.getActor();
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).equals(str)) {
					System.out.println(m);
					count++;
				}
			}
		}
		System.out.println("Amitabh works in " + count + " Movie ");
	}
}
