package com.hashmap_Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student_2_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m1 = new ArrayList<Integer>(Arrays.asList(80, 68, 78, 59, 79));
		Student_2 obj = new Student_2(101, "Abhi", m1);
		// System.out.println(obj);

		ArrayList<Integer> m2 = new ArrayList<Integer>(Arrays.asList(91, 98, 97, 99, 95));
		Student_2 obj1 = new Student_2(102, "Dhaani", m2);
		// System.out.println(obj);

		ArrayList<Integer> m3 = new ArrayList<Integer>(Arrays.asList(87, 88, 86, 85, 89));
		Student_2 obj2 = new Student_2(103, "Priya", m3);
		// System.out.println(obj);

		ArrayList<Integer> m4 = new ArrayList<Integer>(Arrays.asList(89, 69, 68, 99, 73));
		Student_2 obj3 = new Student_2(104, "Suraj", m4);
		// System.out.println(obj);

		ArrayList<Integer> m5 = new ArrayList<Integer>(Arrays.asList(83, 63, 79, 59, 89));
		Student_2 obj4 = new Student_2(105, "Utkarsha", m5);
		// System.out.println(obj);

		ArrayList<Student_2> stdlist = new ArrayList<>();
		stdlist.add(obj);
		stdlist.add(obj1);
		stdlist.add(obj2);
		stdlist.add(obj3);
		stdlist.add(obj4);

		HashMap<String, ArrayList<Student_2>> stdmap = new HashMap<>();
		Iterator<Student_2> stditr = stdlist.iterator();
		while (stditr.hasNext()) {
			Student_2 s = stditr.next();
			// Check if map contain key
			if (stdmap.containsKey(s.getGrade())) {
				ArrayList<Student_2> s1 = stdmap.get(s.getGrade());
				// add new Student in ArrayList
				s1.add(s);
				// Replace that key
				stdmap.put(s.getGrade(), s1);
			} else {
				ArrayList<Student_2> l = new ArrayList<>();
				l.add(s);
				stdmap.put(s.getGrade(), l);
			}
		}
		// System.out.println(stdmap);
		Set<String> set = stdmap.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			System.out.println(stdmap.get(s));
		}

	}

}
